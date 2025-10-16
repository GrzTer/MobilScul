package com.example.a01_wstep_do_jezyka_kotlin

fun main(){
    // Zadanie 1
    fun printWelcome() {
        repeat(3) {
            println("Hello, Kotlin!")
        }
    }
    // Zadanie 2
    fun printMessage(message: String) {
        println(message)
    }
    // Zadanie 3
    fun multiply(a: Int, b: Int): Int {
        return a * b
    }
    // Zadanie 4
    fun cube(n: Int) = n * n * n

    // Zadanie 5
    fun formatProfile(name: String, age: Int): String {
        return "Name: $name, Age: $age"
    }

    // Zadanie 8
    val numbers = listOf(1, 3, 6, 8, 9, 12, 15)
    val result = numbers
        .filter { it % 3 == 0 }
        .map { it * 4 }

    println(result)
}
