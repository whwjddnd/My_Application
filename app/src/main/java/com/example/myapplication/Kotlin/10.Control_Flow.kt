package com.example.myapplication.Kotlin


fun main(args: Array<String>) {

    val value: Int = 4

    when(value) {
        1 -> {
            println("value is 1")
        }
        2 -> {
            println("value is 2")
        }
        3 -> {
            println("value is 3")
        }
        else -> {
            println("결과값을 알수 없습니다.")
        }
    }

    if (value == 1) {
        println("value is 1")
    } else if (value == 2) {
        println("value is 2")
    } else if (value == 3) {
        println("value is 3")
    } else
        println("결과값을 알수 없습니다.")

    val value2 = when (value) {
        1 -> 10
        2 -> 20
        3 -> 30
        else -> 100
    }
    println(value2)

}