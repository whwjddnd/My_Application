package com.example.myapplication.Kotlin

fun main(args: Array<String>) {
    val superCar100 = SuperCar100()
    superCar100.drive()
    superCar100.stop()

    val bus100 = Bus100()
    bus100.drive()

}

open class Car100() {
    fun drive() {

    }

    fun stop() {

    }
}

class SuperCar100() : Car100() {

}

class Bus100() : Car100() {

}