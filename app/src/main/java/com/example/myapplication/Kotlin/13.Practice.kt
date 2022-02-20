package com.example.myapplication.Kotlin




fun main(array: Array<String>) {

    val array = arrayOf<Int>(1, 2, 3)

    // get, set
    val number = array.get(0)
    println(number)

    array.set(0, 100)
    val number2 = array.get(0)
    println(number2)

//    array.set(100, 100)



}