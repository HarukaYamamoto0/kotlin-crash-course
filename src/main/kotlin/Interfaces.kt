package com.harukadev

import kotlin.system.exitProcess

fun main() {
    val rectangle = Rectangle(
        width = 10f,
        height = 5f
    )
    val circle = Circle(
        radius = 15f
    )

    println("The sum of the areas is ${sumAreas(rectangle, circle)}")
    println(rectangle.counter)
    rectangle.inc()
    println(rectangle.counter)
    exitProcess(0)
}

// Abstract classes are like drafts of a class.
abstract class Shape {
    abstract val area: Float
    abstract val diagonal: Float // Don't take the name seriously.

    var counter = 0

    fun inc() {
        counter++
    }
}

fun sumAreas(vararg shapes: Shape) = shapes.sumOf { currentShape -> currentShape.area.toDouble() }
