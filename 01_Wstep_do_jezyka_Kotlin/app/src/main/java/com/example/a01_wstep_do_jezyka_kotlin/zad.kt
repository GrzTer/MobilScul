package com.example.a01_wstep_do_jezyka_kotlin


fun main() {
//     1
    val licz = 5
    if (licz > 0){
        println("dodatnia")
    } else if (licz < 0) {
        println("ujemna")
    } else {
        println("zero")
    }
//     2
    for (i in 1..10) {
        val kwadrat = i * i
        println("Liczba: $i, Kwadrat: $kwadrat")
    }

//    3
    var odliczanie = 5
    while (odliczanie >= 1) {
        println(odliczanie)
        odliczanie--
    }
//    4
    var y = 1
    do {
        println("Wartość: $y")
        y++
    } while (y <= 3)
//    5
    val day = readLine()
    when (day) {
        "Monday" -> println("Poniedziałek")
        "Tuesday" -> println("Wtorek")
        "Wednesday" -> println("Środa")
        "Thursday" -> println("Czwartek")
        "Friday" -> println("Piątek")
        "Saturday" -> println("Sobota")
        "Sunday" -> println("Niedziela")
        else -> println("nieznany dzień")
    }
}