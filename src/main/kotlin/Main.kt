package com.harukadev

fun main() {
    /*
    Interesting fact: intArray creates an immutable array, but when you use the +5 operator on it, it creates a
    new array by adding the old value to the new one.
     */
    val favoriteNumbers = intArrayOf(1, 2, 3, 4, 5)

    print("Tell me the index of your favorite number: ")
    val input = readln()
    val inputAsInteger = input.toIntOrNull()

    if (inputAsInteger != null && inputAsInteger in 0..favoriteNumbers.lastIndex) {
        val favoriteNumber = favoriteNumbers.getOrNull(inputAsInteger)
        println("Your number favorite is $favoriteNumber!")
    } else {
        println("Favorite number not found")
    }
}