package com.harukadev

fun main() {
    val x = 52
    val y = 32
    val areBothEven = ((x and 2) == 0) || ((y or 2) == 0)
    val bitOperator = x shr 2
    println("$areBothEven, $bitOperator")
}