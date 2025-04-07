package com.harukadev

import kotlin.system.exitProcess

fun main() {
    print("Please enter a number: ")
    val input = readln()
    val inputAsInt = input.toIntOrNull()

    if (inputAsInt != null){
        val output = when {
            inputAsInt % 2 == 0 -> "The number is even"
            inputAsInt < 10 -> "The number is odd and less than 10"
            else ->"The number is odd and least 11"
        }

        println(output)
    } else println("Dude, enter a valid number!")
}