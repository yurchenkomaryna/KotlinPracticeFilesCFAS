package com.example.maryna.codefitnesscoding

import org.junit.Test

import org.junit.Assert.*

/**
 * Example local unit test, which will execute on the development machine (host).
 *
 * See [testing documentation](http://d.android.com/tools/testing).
 */
class ExampleUnitTest {
    @Test
    fun addition_isCorrect() {
        val practice = Practice()
        practice.main()

    }
    @Test
    fun testClasses(){
        val car1 = Car("red", "bmw", 2018)
        val car2 = Car("black", "mazda", 2015)

        car1.accelerate(10)
        println(car1.color)
        //car1.beep()

        car2.repaint("green")
        println(car1.color)

        val student = Student(gpa = 3.2, name = "Boris", height = 1.8, gender = "male" )
        student.finishClass()
        println(student.gpa)

        student.birthday()
        println(student.age)
    }
}

