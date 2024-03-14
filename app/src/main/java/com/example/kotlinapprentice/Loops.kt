package com.example.kotlinapprentice
import java.util.*

fun loops(){



    var counter = 0
    var roll = 0

    /*while(counter<10){
        println("counter is $counter")
        counter++
    }*/

    do{
        roll = Random().nextInt(6)
        counter++
        println("After $counter rolls, roll is $roll ")
    }while(roll != 0)



}