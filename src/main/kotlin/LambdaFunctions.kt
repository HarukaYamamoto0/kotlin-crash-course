package com.harukadev

fun main() {
    val favoriteNumbers = intArrayOf(1, 2, 3, 69, 53, 6)

    val filter: (Int) -> Boolean = {
        it % 2 == 0
    }

    val evenNumbers = favoriteNumbers.filter(filter)
    val itNamed = favoriteNumbers.filter { currentInt -> currentInt % 2 == 0 }
    val myFilter = favoriteNumbers.myFilter(filter)

    println(evenNumbers)
    println(itNamed)
    println(myFilter)
}

fun IntArray.myFilter(predicate: Int.() -> Boolean): List<Int> {
    return this@myFilter.filter(predicate)
}
