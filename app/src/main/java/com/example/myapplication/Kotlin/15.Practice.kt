package com.example.myapplication.Kotlin

fun main(array: Array<String>) {

    val a = mutableListOf<Int>(1, 2, 3)
    a.add(4)
    println(a)

    println()
    a.add(0, 100)
    println(a)
    a.add(5, 15)
    println()
    println(a)
    a.add(3, 10)
    println()
    println(a)
    a.set(0, 200)
    println()
    println(a)

    a.removeAt(1)
    println()
    println(a)

    val b = mutableSetOf<Int>(1, 2, 3, 4)

    b.add(2)
    println()
    println(b)

    b.remove(2)
    println()
    println(b)

    b.remove(100)
    println()
    println(b)

    val c = mutableMapOf<String, Int>("one" to 1)

    c.put("two", 2)
    println()
    println(c)
    c.replace("two", 3)
    println(c)
    println()
    println(c.keys)
    println(c.values)
    c.clear()
    println(c)


}