package com.harukadev

import kotlin.system.exitProcess

fun main() {
    print("Please enter a number: ")
    val input = readln()
    val inputAsInt = input.toIntOrNull()

    if (inputAsInt === null) {
        println("Please enter a valid number")
        exitProcess(0)
    }

    val isEven = inputAsInt % 2 == 0
    println(isEven)
}