"use strict";
var port, server, service,
    system = require('system'),
    webpage = require("webpage");

if (system.args.length !== 2) {
    console.log('Usage: serverkeepalive.js <portnumber>');
    phantom.exit(1);
}

port = system.args[1];

server = require('webserver').create();
service = server.listen(port, { keepAlive: true },
    function (request, response) {
        console.log(port + ' Request at ' + new Date());

        try {
            var query = request.url.substring(2); // Get query string
            var shotUrl_filePath = splitUrl(query);

            response.headers = {
                'Cache': 'no-cache',
                'Content-Type': 'text/plain',
                'Connection': 'Keep-Alive',
                'Keep-Alive': 'timeout=10, max=50',
                'Content-Length': 5
            };
            renderUrlToFile(shotUrl_filePath, function () {
                response.statusCode = 200;
                response.write("OK   ");
                response.close();
            }, function () {
                response.statusCode = 500;
                response.write("ERROR");
                response.close();
            });
        } catch(e) {
            console.log("Exception: "+e);
        }
    });

if (service) {
     console.log('Web server running on port ' + port);
} else {
     console.log('Error: Could not create web server listening on port ' + port);
     phantom.exit();
}


function renderUrlToFile(shotUrl_filePath, successFun, errorFun) {
    var page = webpage.create();
    page.onAlert = function(msg) { console.log('<WebPage> ' + msg); };
    page.settings.loadPlugins = true;
    page.settings.webSecurityEnabled = false;
    page.settings.XSSAuditingEnabled = true;
    page.settings.localToRemoteUrlAccessEnabled = true;

//    page.viewportSize = { width: 1920, height: 1080 };
//    page.clipRect = { top: 0, left: 0, width: width, height: height };

    var count = 0;
    page.onLoadStarted  = function() {count += 1;};
    page.onLoadFinished = function() {count += 1;};
    page.onResourceRequested = function() {count += 1;};
    page.onResourceReceived = function() {count += 1;};

//    console.log(shotUrl_filePath[0]);
//    console.log(shotUrl_filePath[1]);
    var url = shotUrl_filePath[0];
    var filePath = shotUrl_filePath[1];

    page.open(url, function(status){
        if(status !== "success") {
            console.log("Unable to render '"+url+"' ("+status+")");
            page.close();
            errorFun();
        } else {
            var start = new Date().getTime();
            var tmp = -1;//must wait 250ms
//            console.log("----count----" + count);

           var interval = setInterval(function() {
//                console.log("****count****" + count);
                var duration = new Date().getTime() - start
                // 默认1s内页面不能加载完毕
                if( duration > 1000 ) {
                    if ( duration < 10000 && tmp != count ) {
                        tmp = count;
                    } else {
                        page.render(filePath);
                        console.log('done');
                        page.close();
                        successFun();
                        clearInterval(interval); //< Stop this interval
                    }
                }
            }, 250);
        }
     });
}

//split the query to get shotUrl and filePath
var splitUrl = function (query) {
    var result = new Array();

    var pairs = query.split("&");
    for (var i = 0; i < pairs.length; i++) {
        var pos = pairs[i].indexOf('='); // Look for "url=xxx"
        if (pos == -1) continue; // If not found, skip

        var argname = pairs[i].substring(0, pos); // Extract the name
        var value = pairs[i].substring(pos + 1); // Extract the value
        value = decodeURIComponent(value); // Decode it, if needed

        if(argname == "shotUrl") {
	        result[0]  = value;
        } else {
	 	    result[1]  = value;
	    }
    }
    return result;
}

