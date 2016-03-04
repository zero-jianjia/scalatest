package org.zero

import org.scalatest.FunSuite

class UtilTest1 extends FunSuite {
    test("UtilObject.getString 1") {
        val v = UtilObject.getString(1)
        assert(v == "1-str")
    }

    test("UtilObject.getString 2") {
        val v = UtilObject.getString(2)
        assert(v == "2-str")
    }

    test("UtilObject get execption") {
        intercept[Exception] {
            UtilObject.getExecption()
        }
    }

}
