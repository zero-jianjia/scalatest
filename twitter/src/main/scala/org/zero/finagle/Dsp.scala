package org.zero.finagle


/**
  * Created by jianjia1 on 2016/2/17.
  */
object Dsp {
    val repo = SimpleMethodLookup(List[String]("msg", "Error"))

    val testConfig =
        """
          |frontEndServer Port : 8080
          |BrandAndPDServer Port : 8081
          |fuyiServer Port:8082
        """.stripMargin

}
