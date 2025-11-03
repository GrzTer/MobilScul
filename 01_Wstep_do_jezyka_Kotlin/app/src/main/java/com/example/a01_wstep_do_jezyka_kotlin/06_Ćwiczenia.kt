package com.example.a01_wstep_do_jezyka_kotlin


fun main() {
    //Zadanie 1
    class Car(val brand: String, val year: Int) {
        fun printInfo() {
            println("Marka: $brand, Rok produkcji: $year")
        }
    }
    val car1 = Car("Ford", 2023)
    car1.printInfo()
    println()

    //Zadanie 2
    data class Student(val name: String, val grade: Int)
    val students = listOf(
        Student("Grzegorz", 5),
        Student("Fil", 3),
        Student("Nico", 4),
        Student("Maks", 2),
        Student("Bartomiej", 5)
    )

    val passed = students.filter { it.grade >= 4 }
    println("Studenci, którzy zdali: $passed")
    println()

    //Zadanie 3
    data class Product(val name: String, val price: Double)

    fun discountedPrices(products: List<Product>, discountRate: Double): List<Double> {
        return products.map { it.price * (1.0 - discountRate) }
    }
    val products = listOf(
        Product("Mleko", 4.0),
        Product("Chleb", 5.0),
        Product("Sok", 6.5)
    )

    val discounted = discountedPrices(products, 0.1)
    println("Ceny po zniżce 10%: $discounted")
    println()

    //Zadanie 4
    data class Book(val title: String, val author: String, val pages: Int)

    val book1 = Book("Problem Trzech Ciał", "Cixin Liu", 416)
    val book2 = book1.copy(pages = 432)

    println("Oryginał: $book1")
    println("Kopia: $book2")
    println("Czy równe (book1 == book2): ${book1 == book2}")
    println()

    //Zadanie 5
    class TrafficLight(var color: String) {
        fun action(): String {
            return when (color) {
                "Green" -> "Go"
                "Yellow" -> "Prepare to stop"
                "Red" -> "Stop"
                else -> "Invalid signal"
            }
        }
    }
    val light = TrafficLight("Green")
    println("Green: ${light.action()}")

    light.color = "Red"
    println("Red: ${light.action()}")

    light.color = "Blue"
    println("Blue: ${light.action()}")

    println()

    //Zadnie6
    class Employee(val name: String, val position: String, val salary: Double)

    fun calculateSalariesWithBonus(employees: List<Employee>): List<Double> {
        return employees.map { emp ->
            println("Pracownik: ${emp.name} (${emp.position})")
            val bonus = when (emp.position) {
                "Manager" -> 1000.0
                "Developer" -> 500.0
                else -> 300.0
            }
            emp.salary + bonus
        }
    }

    
    val employees = listOf(
        Employee("Jan Kowalski", "Manager", 10000.0),
        Employee("Anna Zając", "Developer", 8000.0),
        Employee("Piotr Nowak", "Tester", 6000.0)
    )

    val finalSalaries = calculateSalariesWithBonus(employees)
    println("Wynagrodzenia po dodaniu bonusów: $finalSalaries")
}