package com.zero.oop

/**
  * Created by Inuyasha on 16.03.26.
  */
class Human {
    println("Human")
}

trait TTeacher extends Human {
    println("TTeacher")

    def teach
}

trait PianoPlayer extends Human {
    println("PianoPlayer")

    def playPiano = {
        println("I’m playing piano. ")
    }
}

//从左到右实例化，已经实例的不再重复实例，比如 Human
class PianoTeacher extends Human with TTeacher with PianoPlayer {
    override def teach = {
        println("I’m training students. ")
    }
}

object MultiTrait {
    def main(args: Array[String]): Unit = {
        new PianoTeacher().teach

        //fangshi
        val t2 = new Human with TTeacher with PianoPlayer {
            def teach = { println("I'm teaching students.") }
        }
        t2.playPiano
        t2 teach
    }
}
