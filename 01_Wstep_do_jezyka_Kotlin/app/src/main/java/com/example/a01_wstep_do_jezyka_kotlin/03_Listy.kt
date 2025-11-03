package com.example.a01_wstep_do_jezyka_kotlin
// Zad 1
fun main(){
    val liczby = arrayListOf(4, 6, 6, 9, 6, 6, 8, 8, 8, 2, 2, 2, 2, 7, 8, 8)
    var max_dlugosc = 1
    var max_wartosc = 0
    var cur_dlugosc = 1

    for (i in 1 until liczby.size){
        if (liczby[i] == liczby[i - 1]){
            cur_dlugosc++
            if(cur_dlugosc > max_dlugosc) {
                max_dlugosc = cur_dlugosc
                max_wartosc = liczby[i]
            }
        }
            else {
                cur_dlugosc = 1
        }
    }
    println("1 podpunkt: ${max_dlugosc}")

    println("2 podpunkt: ${max_wartosc}")

    println("3 podpunkt: ${liczby.distinct()}")

    val lista = arrayListOf(1, 1)
    for (i in 2 until 10) {
        lista.add(lista[i - 1] + lista[i - 2])
    }
    println(lista)

}