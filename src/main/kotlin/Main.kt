package com.harukadev

import kotlin.system.exitProcess

fun main() {
    var inputAsInt: Int?

    do {
        print("Please enter a number: ")
        val input = readln()
        inputAsInt = input.toIntOrNull()

        if (inputAsInt === null) {
            println("Please enter a valid number")
            continue
        }

        val isEven = inputAsInt % 2 == 0

        if (isEven) println("Yes the number $inputAsInt is even.")
        else println("No, the number 1 is not even.")

        println("Do you want to test again?")
        val choice = readln()

        if (arrayOf("Y", "y", "Yes", "yes", "YES").contains(choice)) {
            inputAsInt = null
            continue
        }
        if (arrayOf("N", "n", "No", "no", "NO").contains(choice)) exitProcess(0)

    } while (inputAsInt === null)
}