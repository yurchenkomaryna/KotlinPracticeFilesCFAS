package com.example.maryna.codefitnesscoding

class Car(val color_: String, model: String, year: Int) {
    //var color: String
    //var model: String
    //var year: Int
    var color: String = color_
    private var speed: Int = 0
     init{
         println("I am $model")
     }

    fun beep(){
        println("Beep!")
    }

    fun accelerate(deltaSpeed: Int){
        speed += deltaSpeed
    }

    fun carBrake(){
        speed = 0
    }
    fun repaint(newColor: String){
        color = newColor
    }
}