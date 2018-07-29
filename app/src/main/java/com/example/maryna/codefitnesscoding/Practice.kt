package com.example.maryna.codefitnesscoding

class Practice {
    fun main(){
        println("hello")
        sum()
        printOneToHundred()
        printOneToTenWhile()
        orintOneToTenFor()

        // Arrays
        // [1, 20, 50, 60, 22, 15]
        val myArray = intArrayOf(10, 56, 58, 26, 48)
        //first element
        println(myArray[1])
        //last element
        println(myArray[-1])

    }

    // print 2 interers and print the results

    fun sum(a: Int = 5, b: Int = 6){
        val result = a + b
        println(result)


        val takeName = takeName("maryna")
        println(takeName)
    }


    //not reusable
    fun add(){
        val num1 = 5
        val num2 = 2
        val summ = num1 + num2
        println(summ)
    }

//    val addResult = add(20, 30)
//    //
//    fun addReturn(number1: Int, number2: Int): Int{
//        val sum = number1 + number2
//        if (sum > 20) {
//            return sum
//        }
//        return -1
//    }

    // create a functions with one argunemt name and returns "hello, name"
    // we need specify what we return : String
    fun takeName(name: String): String{
        return "Hello $name"
    }

    // function isYoung takes age => returns "YOUNG" if age less than 60, "OLD" if 60+
    fun isYoung(age: Int): Boolean {
        return age < 60
    }

    fun printAgeStatus(age: Int) {
        when (age){
            0 -> println("Did not born yet")
            in 1..5 -> println("newborn")
            in 6..12 -> println("child")
            else -> println("adult")
        }
    }

    fun isYoungStatus(age: Int){
        when(isYoung(age)){
            true -> println("young")
            false -> println("old")
        }
    }


    // Same a = a + 1 => a++, a+=1

    fun printOneToHundred(){
        var x = 1
        while(x <= 10) {
            println(x)
            x++
        }
    }

    fun lessThanTen(x: Int): Boolean{
        return x <= 10
    }

    fun printOneToTenWhile(){
        var x = 1
        do {
            println(x)
            x++
        }while(x <=10)
    }

    fun orintOneToTenFor(){
        for(x in 1..10){
            println("$x, ")
        }

    }

    fun printAllElements(arr: IntArray){
        for (x in arr){
            println(x)
        }
    }
}
