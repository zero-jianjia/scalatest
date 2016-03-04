package org.zero

/**
  * Created by Inuyasha on 16.03.03.
  */
object UtilObject {
    def getString(i: Int): String = {
        i + "-str"
    }

    @throws(classOf[Exception])
    def getExecption() = {
        throw new Exception
    }
}

class UtilClass {
    def getString(i: Int): String = {
        i + "-str"
    }

    def getString(): String = {
        "str"
    }
}