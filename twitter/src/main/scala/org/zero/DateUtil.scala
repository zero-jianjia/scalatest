package org.zero

import java.time.format.DateTimeFormatter
import java.time.{LocalDate, LocalDateTime}

/**
  * Created by Inuyasha on 16/02/21.
  */
object DateUtil {
    private[this] val _yyyyMMddHHmm = DateTimeFormatter.ofPattern("yyyyMMdd-HHmmss")
    private[this] val _yyyyMMdd = DateTimeFormatter.ofPattern("yyyyMMdd")

    def getDateTimeMinuteFormat(time: LocalDateTime) = {
        _yyyyMMddHHmm.format(time)
    }

    def getDateFormat(time: LocalDate) = {
        _yyyyMMdd.format(time)
    }

    def timeTargetingValue(time: LocalDateTime): Int = {
        1 << time.getHour
    }
}
