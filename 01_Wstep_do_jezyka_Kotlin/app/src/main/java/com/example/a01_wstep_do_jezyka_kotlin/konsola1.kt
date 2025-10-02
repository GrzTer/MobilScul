package com.example.a01_wstep_do_jezyka_kotlin


fun main() {
    print("Podaj swoją liczbę całkowitą: ")
    val liczbaStr = readLine()
    var liczba: Int = liczbaStr?.toIntOrNull() ?: 0
    println("Początkowa wartość liczby: $liczba")
    liczba = liczba + 10
    println("Nowa wartość liczby po dodaniu 10: $liczba")
}