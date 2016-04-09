package com.zero

object ContextImplicit {
    implicit val default_qwer: String = "Java"
}

object Param {
    def print(content: String)(implicit language: String) {
        println(language + ": " + content)
    }
}

object ImplicitParameter {
    def main(args: Array[String]) {
        Param.print("Spark")("Scala")
        import ContextImplicit._ //会导入ContextImplicit的default_qwer的隐式参数
        Param.print("Hadoop")
    }
}