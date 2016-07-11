package org.zero.twitter

import java.time.LocalDateTime
import java.util.TimeZone
import java.util.concurrent.TimeUnit

import com.twitter.conversions.time._
import com.twitter.finagle.util.HashedWheelTimer
import com.twitter.util.{Duration, ScheduledThreadPoolTimer, Time, TimeFormat}
import org.zero.DateUtil

/**
  * Created by jianjia1 on 16/06/24.
  */
object HashedWheelTimerTest {
    def main(args: Array[String]) {
        //        test1

        val timeFormat = new TimeFormat("yyyyMMddHHmm", TimeZone.getTimeZone("CTT"))
        val now = timeFormat.parse("201606241205")
        val period = 10
        var expertTime = timeFormat.format(now.plus(period.minutes)).toLong
        //        val diff = if (expertTime % period == 0) -period else expertTime % period
        expertTime = expertTime - expertTime % period
        println(expertTime)

        //        val a = timeFormat.format(expertTime)
        //        println(a)
        test2
    }

    def test2: Unit = {
        println(System.currentTimeMillis())
        //new ScheduledThreadPoolTimer().
        //HashedWheelTimer.apply(Duration.fromSeconds(1), 5)
        val timer =  new ScheduledThreadPoolTimer()

        timer.schedule(Time.fromSeconds(5), 5.seconds)({
            println(System.currentTimeMillis() / 1000 + " a run")
            TimeUnit.SECONDS.sleep(3)
        })
        timer.schedule(Time.fromSeconds(2), 3.seconds)({
            println(System.currentTimeMillis() / 1000 + " b run")
            TimeUnit.SECONDS.sleep(2)
        })
        Thread.sleep(1000000)
    }

    def test1: Unit = {
        //        println(System.currentTimeMillis())
        //        println(System.currentTimeMillis() % 60000)
        //        println(System.currentTimeMillis() / 1000 % 60)
        println(DateUtil.getDateTimeMinuteFormat(LocalDateTime.now()))

        println("-------------")
        val timeFormat = new TimeFormat("yyyyMMdd-HHmmss",
            TimeZone.getTimeZone("CTT" /*GMT+8:00*/))
        println(timeFormat.format(Time.now))
        val t = Time.fromSeconds(100)
        println(t.format("yyyyMMdd-HHmmss"))
        //        Time.now.plus(Duration.apply())


        HashedWheelTimer.Default.schedule(timeFormat.parse("20160624-113900"), 5.seconds)({
            println(DateUtil.getDateTimeMinuteFormat(LocalDateTime.now()) + " run")
        })

        Thread.sleep(1000000)
    }
}
