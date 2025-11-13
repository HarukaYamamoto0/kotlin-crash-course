package com.harukadev

import kotlin.system.exitProcess

fun main() {
    while (true) {
        print("Type the text: ")
        val input = readln()

        if (input.isEmpty() || input.length < 2) continue

        val inputReversed = input.shuffled()
        println("Shuffled text: $inputReversed")
        break
    }
    exitProcess(0)
}

/**
 * Returns a new string where the characters of the original string are shuffled randomly.
 */
fun String.shuffled(): String {
    return this.toList().shuffled().joinToString("")
}