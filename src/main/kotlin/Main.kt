package com.harukadev

import kotlin.system.exitProcess

fun main() {
    while (true) {
        print("Type the number: ")
        val input = readln()

        if (input.isEmpty() || input.length < 2 || input.toIntOrNull() == null) continue

        val inputReversed = shuffled(value = input.toInt())
        println("Shuffled: $inputReversed")
        break
    }
    exitProcess(0)
}

/**
 * Returns a new string where the characters of the original string are shuffled randomly.
 */
fun shuffled(value: String): String {
    return value.toList().shuffled().joinToString("")
}

/**
 * Returns a new integer where the digits of the original integer are shuffled randomly.
 */
fun shuffled(value: Int): Int {
    return shuffled(value.toString()).toInt()
}