package com.example.a01_wstep_do_jezyka_kotlin

fun main() {
    var tekst: String?
    println("Podaj tekst: ")
    tekst = readLine()
    if (tekst.isNullOrBlank()) {
        tekst = null
        println("Brak tekstu!")
    } else {
        println("Długość: ${tekst.length}")
    }
}

