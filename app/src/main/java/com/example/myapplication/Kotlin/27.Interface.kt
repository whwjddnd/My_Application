package com.example.myapplication.Kotlin


fun main(args: Array<String>) {
    val student_ : Student_ = Student_()
    student_.eat()
    student_.sleep()
}

interface Person_ {
    fun eat()
    fun sleep()
}

class Student_ : Person_ {
    override fun eat() {
    }

    override fun sleep() {
    }
}

class SoccerPlayer : Person_ {
    override fun eat() {
    }

    override fun sleep() {
    }
}


open class Person() {
    open fun eat() {

    }

    fun sleep() {

    }
}

class Student() : Person() {
    override fun eat() {
        super.eat()
    }
}

class Teacher() : Person() {

}

