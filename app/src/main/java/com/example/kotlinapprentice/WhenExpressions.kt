package com.example.kotlinapprentice

fun whenExpressions(){

    /*
    * 1. Write a when expression that takes an age as an integer and prints out the life
        stage related to that age. You can make up the life stages, or use the
        categorization as follows: 0-2 years, Infant; 3-12 years, Child; 13-19 years,
        Teenager; 20-39, Adult; 40-60, Middle aged; 61+, Elderly.
       2. Write a when expression that destructures a Pair containing a string and an
       integer. The string is a name, and the integer is an age. Use the same cases that
       you used in the previous exercise to print out the name followed by the life stage.
       For example, for myself it would print out "Joe is an adult.".
    * */

    //val age = 37
    val (name, age) = Pair("Damian", 37)

    when(age){
        in 0..2 -> println("$name is an Infant")
        in 3..12 -> println("$name is an Child")
        in 13..19 -> println("$name is an Teenager")
        in 20..39 -> println("$name is an Adult")
        in 40..60 -> println("$name is an Midle Aged")
        else -> println("$name is an Elderly")
    }
}