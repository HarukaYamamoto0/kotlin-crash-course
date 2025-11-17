package com.harukadev

import kotlin.math.PI
import kotlin.math.sqrt
import kotlin.system.exitProcess

fun main() {
    val rect1 = Rectangle(width = 5f, height = 7f)
    val rect2 = rect1.copy(height = 10f)

    println(rect1)
    println("The diagonal is ${rect1.diagonal} and area is ${rect1.area}")
    println("Max area is ${maxArea(rect1, rect2)}")
    println("Are rectangles Rect1 and Rect2 equals? ${rect1 == rect2}")

    val circle = Circle(radius = 10f)
    println("The area of the circle is ${circle.area} and the diagonal is ${circle.diagonal}")

    exitProcess(0)
}

fun maxArea(firstRectangle: Rectangle, secondRectangle: Rectangle): Float {
    return maxOf(firstRectangle.area, secondRectangle.area)
}

data class Rectangle(val width: Float, val height: Float) : Shape {
    override var counter = 0
    override val diagonal = sqrt(width * width + height * height)
    override val area = width * height
}

data class Circle(val radius: Float) : Shape {
    override var counter = 0
    override val area = radius * radius * PI.toFloat()
    override val diagonal = area * radius
}