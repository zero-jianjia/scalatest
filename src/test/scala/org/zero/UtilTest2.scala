package org.zero

import org.mockito.Mockito.{never, times, verify, when}
import org.scalatest.FunSuite
import org.mockito.Matchers.any
import org.scalatest.mockito.MockitoSugar

/**
  * Created by Inuyasha on 16.03.03.
  */
class UtilTest2 extends FunSuite with MockitoSugar {

    test("UtilClass.getString") {
        val util = mock[UtilClass]
        when(util.getString()).thenReturn("zero")
        when(util.getString(any[Int])).thenReturn("hello")

        println(util.getString(1))
        println(util.getString())
    }
}
