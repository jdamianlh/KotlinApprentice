package com.example.kotlinapprentice

fun conditions(){

    val myAge = 37
    val theirAge = 16

    if(myAge in 13..19){
        println("Teenager")
    }else{
        println("Not a teenager")
    }

    val answer = if(theirAge in 13..19){
        "Teenager"
    }else{
        "Not a teenager"
    }

    println(answer)
}