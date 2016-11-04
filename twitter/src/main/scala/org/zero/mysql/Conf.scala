package org.zero.mysql

object Conf {

   object Sax {
     val host     = "127.0.0.1"
     val port     =  3306
     val username = "root"
     val password = ""
     val dbname   = "jianjia"
     val tables   = Array("t_tomcat", "advertiser", "creative", "dsp", "network", "resource")

     override def toString = "%s\n%s\n%s\n%s\n%s\n%s".format(host,port,username,password,dbname,tables.toList)
   }

}