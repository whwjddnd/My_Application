package com.example.myapplication.Kotlin




fun main(args: Array<String>) {


    // List
    val numberList = listOf<Int>(1, 2, 3)
    println(numberList)
    println()

    // set
    val numberSet = setOf<Int>(1, 2, 3, 3, 3)
    println(numberSet)
    println()

    // map
    val numberMap = mapOf<String, Int>("one" to 1, "two" to 2)
    println(numberMap)
    println()

    // Mutable Collection
    val mNumberList = mutableListOf<Int>(1, 2, 3)
    mNumberList.add(3,4)
    println(mNumberList)
    println()

    val mNumberSet = mutableSetOf<Int>(1, 2, 3, 4, 4, 4)
    mNumberSet.add(10)
    println()

    val mNumberMap = mutableMapOf<String, Int>("one" to 1)
    mNumberMap.put("two", 2)
    println(mNumberMap)


}