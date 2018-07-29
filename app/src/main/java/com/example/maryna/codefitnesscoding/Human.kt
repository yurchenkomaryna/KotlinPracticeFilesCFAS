package com.example.maryna.codefitnesscoding

open class Human(private val name: String, height: Double, gender: String) {
    private var age = 0
    //private var name = name

    fun birthday(){
        age++
        println("$name PARTY!")
    }
}