package com.example.myapplication.Kotlin


fun main(args: Array<String>) {

    val a: Int = 5
    val b: Int = 10
    val c = 15
    val d = 15

    if (a > b) {
        println("a가 b보다 크다")
    } else {
        println("a가 b보다 작다")
        println()
    }


    if (c > d) {
        println("c가 d보다 크다")
    } else if (c < d) {
        println("c가 d보다 작다")
    } else {
        println("c와 d는 같다")
    }

    val max = if (a < d) {
        a
    } else {
        d
    }

    println()
    println(max)

}