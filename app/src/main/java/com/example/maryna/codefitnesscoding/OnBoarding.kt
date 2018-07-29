package com.example.maryna.codefitnesscoding

import java.lang.Math.round

class OnBoarding {
    fun test(){
        val number: Int = 10
        val str: String = "Hello Kotlin!"
        val double: Double = 10.4
        val flag: Boolean = true
        val char: Char = 'c'

        val camelCase = 56 // good one
        val sneak_case = 21



        var mutableNumber: Int = 10
        println(mutableNumber)

        val numberOfStudents = 15

        println("Hello, Bootcamp! There are $numberOfStudents students online right now")

        val age = 30

        if (age > 10) {
            print("Age < 10")
        }else{
            print("Age >= 10")
        }

        if (age > 10) {
            print("Age < 10")
        }else if (age > 30){
            print("Age >= 10")
        }else{
            print("Age >= 20")
        }

        HelloWorld("Boris", 56)

        val myFlag = true
        // ! negotiation
        // && - and
        // || - or

        //will not print
        if (age == 30 && myFlag){
            println("I'm 30")
        }
        //will print it
        if (age == 30 && myFlag){
            println("I'm 30")
        }

        val sum = 10 + 30
        val sub = 20 - 10
        val mult = 20 * 10
        val dev = 20 / 10
        val remainder = 29 % 10 // => 9

        println(remainder)

        val doubleNumb = 26.0 / 10
        print(" print rounded number => ${round(doubleNumb)}")
    }
    // function with arguments and this function can be called from any place or any functions
    fun HelloWorld(name: String, age: Int){
    println("HelloWorld! $name")
    }

}