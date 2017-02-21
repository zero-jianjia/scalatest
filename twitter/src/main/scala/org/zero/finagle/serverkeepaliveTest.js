"use strict";
var port, server, service,
    system = require('system');

if (system.args.length !== 2) {
    console.log('Usage: serverkeepalive.js <portnumber>');
    phantom.exit(1);
}

port = system.args[1];

server = require('webserver').create();
service = server.listen(port, { keepAlive: true },
    function (request, response) {
        console.log('Request at ' + new Date());

        var shotUrl = "";
	    var filePath = "";
	        try{
	            var query = request.url.substring(2); // Get query string
	            splitUrl(query);
	        }catch(e) {
                response.statusCode = 500;
            }
        var body = "afdg";
        response.statusCode = 200;
        response.headers = {
            'Cache': 'no-cache',
            'Content-Type': 'text/plain',
            'Connection': 'Keep-Alive',
            'Keep-Alive': 'timeout=5, max=100',
            'Content-Length': body.length
        };
        response.write(body);
        response.close();
    });

    if (service) {
        console.log('Web server running on port ' + port);
    } else {
        console.log('Error: Could not create web server listening on port ' + port);
        phantom.exit();
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
