package com.example.a01_wstep_do_jezyka_kotlin

fun main() {
    print("Podaj liczbę: ")
    var input = readLine()
    var num = input?.toDoubleOrNull()
    if (num != null) {
        num = num * num
        println("Kwadrat podanej liczby to: $num")
    } else {
        println("To nie jest poprawna liczba.")
    }
}

