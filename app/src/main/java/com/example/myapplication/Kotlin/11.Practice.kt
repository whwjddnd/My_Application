package com.example.myapplication.Kotlin


fun main(args: Array<String>) {

    val value: Int? = null

    when (value) {
        null -> println("value is null")
        else -> println("value is not null")
    }

    val value2: Boolean? = null

    when (value2) {
        true -> {
            println("")

        }
        false -> {

        }

    }


}