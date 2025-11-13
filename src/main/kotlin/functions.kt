package com.harukadev

import kotlin.system.exitProcess

fun main() {
    while (true) {
        print("Type the text: ")
        val input = readln()

        if (input.isEmpty() || input.length < 2) continue

        val inputReversed = reversed(string = input)
        println("Reverse text: $inputReversed")
        break
    }
    exitProcess(0)
}

fun reversed(string: String): String {
    return string.reversed()
}