package com.example.kotlinapprentice

/*1. Create a constant called myAge and set it to your age. Then, create a constant
named isTeenager that uses Boolean logic to determine if the age denotes
someone in the age range of 13 to 19.
2. Create another constant named theirAge and set it to the age 30. Then, create a
constant named bothTeenagers that uses Boolean logic to determine if both you
and them are teenagers.
3. Create a constant named reader and set it to your name as a string. Create a
constant named author and set it to the name Richard Lucas. Create a constant
named authorIsReader that uses string equality to determine if reader and
author are equal.
4. Create a constant named readerBeforeAuthor which uses string comparison to
determine if reader comes before author.*/

fun comparisonOperators(){
    val myAge = 37
    val theirAge = 30
    val reader = "Jawaharlal"
    val author = "Richard Lucas"
    val authorIsReader = (reader == author)
    val readerBeforeAuthor = reader < author

    val isTeenager = (13 .. 19)

    val bothTeenagers = (myAge in isTeenager) && (theirAge in isTeenager)

    println(myAge in isTeenager)
    println(bothTeenagers)
    println(authorIsReader)
    println(readerBeforeAuthor)
}



