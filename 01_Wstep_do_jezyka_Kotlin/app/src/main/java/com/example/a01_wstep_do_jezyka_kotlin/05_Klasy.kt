package com.example.a01_wstep_do_jezyka_kotlin


// Zadanie 1
class Employee(val name: String, val position: String, var salary: Double) {
    fun displayInfo() {
        println("Pracownik: $name, Stanowisko: $position, Pensja: $salary")
    }
    override fun toString() = "Employee(name='$name', position='$position', salary=$salary)"
}

//Zadanie 2
data class Book(val title: String, val author: String, val year: Int)

fun printBookDetails(book: Book) {
    println("Książka: ${book.title} (${book.author}, ${book.year})")
}

fun main() {
    val emp1 = Employee("Anna Nowak", "Programista", 8500.0)
    emp1.displayInfo()
    println(emp1)
    println()
    val book1 = Book("Problem Trzech Ciał", "Cixin Liu", 2008)
    val book2 = book1.copy(year = 2014)

    val (title, author, year) = book2
    println("Destrukturyzacja: $title, $author, $year")

    println("Porównanie (book1 == book2): ${book1 == book2}")
    val book3 = book1.copy()
    println("Porównanie (book1 == book3): ${book1 == book3}")

    printBookDetails(book1)
}