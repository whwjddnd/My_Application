package com.example.myapplication.Kotlin

fun plusThree(first: Int, second: Int, third: Int): Int {
    val result = first + second + third
    return result
//    return first + second + third
}

fun minusThree(first: Int, second: Int, third: Int) = first - second - third

fun multiplyThree(first: Int = 1, second: Int = 1, third: Int = 1): Int {
    return first * second * third
}

// 내부함수
// - 함수 안에 함수가 있다.
fun showMyPlus(first: Int, second: Int): Int {
    println(first)
    println(second)

    fun plus(first: Int, second: Int): Int {
        return first + second
    }
    return plus(first, second)
}

fun main(array: Array<String>) {
    val result = plusThree(1,2, 3)
    println(result)
    println()
    val result2 = minusThree(10,2,2)
    println(result2)
    println()
    val result3 = multiplyThree(2,2,2)
    println(result3)
    println()
    val result4 = multiplyThree()
    println(result4)

    println()
    val result5 = showMyPlus(4, 5)
    println(result5)

}