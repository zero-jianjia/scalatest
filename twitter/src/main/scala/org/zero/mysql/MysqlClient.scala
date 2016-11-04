package org.zero.mysql

import com.twitter.finagle.exp.Mysql
import sun.rmi.runtime.Log
import com.twitter.util.Future
import com.twitter.finagle.exp.mysql.NullValue
import com.twitter.finagle.exp.mysql.EmptyValue
import com.twitter.finagle.exp.mysql.IntValue
import com.twitter.finagle.exp.mysql.ByteValue
import com.twitter.finagle.exp.mysql.DoubleValue
import com.twitter.finagle.exp.mysql.BigDecimalValue
import com.twitter.finagle.exp.mysql.StringValue
import com.twitter.finagle.exp.mysql.Value

object MysqlClient {
    private[this] val saxClient = Mysql.client
        .withCredentials(Conf.Sax.username, Conf.Sax.password)
        .withDatabase(Conf.Sax.dbname)

        .newRichClient("%s:%d".format(Conf.Sax.host, Conf.Sax.port))

    def selectRows(dbname: String, tablename: String, ids: Array[String]): Future[Seq[Map[String, String]]] = {
        dbname match {
            case Conf.Sax.dbname => {
                tablename match {
                    case "t_tomcat" => selectAdunit(dbname, ids)
                    case _ => {
                        throw new Exception("MysqlClient selectAll failed %s, %s".format(dbname, ids.toString))
                    }
                }
            }
            case _ => {
                throw new Exception("MysqlClient selectRows error")
            }
        }
    }

    def selectAdunit(dbname: String, ids: Array[String]): Future[Seq[Map[String, String]]] = {
        val sql = "SELECT * FROM t_tomcat"

        saxClient.select(sql) { row =>
            val id = get(row("id").get)
            val tomcat = get(row("tomcat").get)

            Map("id" -> id, "tomcat" -> tomcat)
        }
    }

    private[this] val get = (value: Value) => {
        value match {
            case IntValue(i) => i.toString
            case StringValue(s) => s
            case NullValue => ""
            case DoubleValue(d) => d.toString
            case ByteValue(b) => b.toString
            case EmptyValue => ""
            case BigDecimalValue(bd) => bd.toString
            case _ => {
                throw new Exception("MysqlClient get failed, type error")
            }
        }
    }
}