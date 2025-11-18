package com.harukadev

import java.text.SimpleDateFormat
import java.time.LocalDate
import java.time.format.DateTimeFormatter
import java.util.Date
import kotlin.system.exitProcess

fun main() {
    println(greetMe(Country.BRAZIL))
    for (country in Country.entries) {
        println(country.code)
    }
    println(FixSizeSquare.area)
    println(DateUtil.formatDate(date = Date()))

    exitProcess(0)
}

object DateUtil {
    fun formatDate(date: Date): String {
        val sdf = SimpleDateFormat("dd/M/yyyy hh:mm:ss")
        return sdf.format(date)
    }
}

data object FixSizeSquare : Shape {
    override val area = 16f
    override val diagonal = 10f
    override var counter = 0
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