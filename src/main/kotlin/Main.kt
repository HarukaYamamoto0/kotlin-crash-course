package com.harukadev

fun main() {
    val x = 52
    var y = 32
    y++
    y+=1
    y--
    y*=1
    y/=2
    y%=3
    y++
    println("${x != y} ${x === y} ${x >= y}")
}