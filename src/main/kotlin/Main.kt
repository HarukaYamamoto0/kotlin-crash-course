package com.harukadev

import kotlin.system.exitProcess

fun main() {
    print("How many numbers do you want to store?: ")
    val amountOfNumbers = readln().toIntOrNull() ?: 0

    if (amountOfNumbers <= 0) {
        println("Ok, Leaving...")
        exitProcess(0)
    }

    val numbers = mutableListOf<Int>()

    for (i in 0 until amountOfNumbers) {
        print("Enter with number #${i + 1}: ")
        val number = readln().toIntOrNull() ?: continue

        if (number >= 0) numbers.add(number)
    }

    println("The stored numbers are: ${numbers.joinToString()}")
    println("The sum of all items is ${numbers.sum()}")
}