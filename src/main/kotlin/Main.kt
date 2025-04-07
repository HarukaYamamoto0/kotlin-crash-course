package com.harukadev

fun main() {
    print("Please enter a number: ")
    val input = readln()
    val inputAsInt = try {
        input.toInt()
    } catch (e: NumberFormatException) {
        -1
    }

    val output = when(inputAsInt) {
        3 -> "The number is three!"
        5 -> "The number is five!"
        in 1..10 -> "The number is between 10 and 20"
        else -> "I have no idea to print"
    }

    println(output)
}