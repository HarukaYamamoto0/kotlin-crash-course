package com.harukadev

import kotlin.math.roundToInt
import kotlin.system.exitProcess

fun main() {
    val favoriteNumbers = listOf(1, 2, 3, 69)
    val messages = listOf("Hello World", "Hi", "OK")

    val evenNumbers = favoriteNumbers.myFilter { it % 2 == 0 }
    val filteredStrings = messages.myFilter { it.length > 8 }

    println(evenNumbers)
    println(filteredStrings)

    val result = makeNetworkCall()
    println(result)

    val numbersMapped = favoriteNumbers.myMap { it.toDouble() }
    println(numbersMapped)

    exitProcess(0)
}

fun <T> Iterable<T>.myFilter(predicate: (T) -> Boolean): List<T> {
    return filterTo(mutableListOf(), predicate) // Same as the original implementation.
}

fun makeNetworkCall(): Result<Int, String> {
    val isSuccess = Math.random().roundToInt()
    return if (isSuccess == 0) Result.Success(69)
    else Result.Failure("Network error")
}

// The `out` keyword essentially allows subclasses like `Success` and `Failure` to be accepted as `Result`.
sealed interface Result<out D, out E> {
    data class Success<out D>(val data: D) : Result<D, Nothing>
    data class Failure<out E>(val error: E) : Result<Nothing, E>
}

fun <T, R> Iterable<T>.myMap(transform: (T) -> R): List<R> {
    val result = mutableListOf<R>()
    for (item in this) {
        result.add(transform(item))
    }
    return result
    // or return mapTo(mutableListOf(), transform)
}