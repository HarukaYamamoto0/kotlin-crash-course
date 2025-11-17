package com.harukadev

import kotlin.system.exitProcess

fun main() {
    println(greetMe(Country.BRAZIL))
    for (country in Country.entries) {
        println(country.code)
    }
    exitProcess(0)
}

// The difference compared to Sealed is that I explicitly state which values are available.
enum class Country(val code: String) {
    BRAZIL("PT_BR"),
    FRANCE("FR"),
    USA("US")
}

fun greetMe(country: Country): String {
    return when (country) {
        Country.BRAZIL -> "Eai"
        Country.FRANCE -> "Bonjuor!"
        Country.USA -> "Hello"
    }
}