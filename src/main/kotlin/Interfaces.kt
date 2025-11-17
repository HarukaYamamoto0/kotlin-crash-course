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

    printShapes(rectangle, circle)

    exitProcess(0)
}

fun printShapes(vararg shapes: Shape) {
    for (shape in shapes) {
        val output = when (shape) {
            is Circle -> "Is Circle"
            is Rectangle -> "Is Rectangle"
        }
        println(output)
    }
}

// Abstract classes are like drafts of a class.
sealed interface Shape {
    val area: Float
    val diagonal: Float // Don't take the name seriously.
    var counter: Int

    fun inc() {
        counter++
    }
}

fun sumAreas(vararg shapes: Shape) = shapes.sumOf { currentShape -> currentShape.area.toDouble() }
