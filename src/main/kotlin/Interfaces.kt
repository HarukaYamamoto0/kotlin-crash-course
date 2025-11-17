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
    exitProcess(0)
}

interface Shape {
    val area: Float
    val diagonal: Float
}

fun sumAreas(vararg shapes: Shape) = shapes.sumOf { currentShape -> currentShape.area.toDouble() }
