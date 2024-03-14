package com.example.kotlinapprentice

import kotlin.math.sqrt

/*
       1. Create a constant named range and set it equal to a range starting at 1 and
       ending with 10 inclusive. Write a for loop which iterates over this range and
       prints the square of each number.
       2. Write a for loop to iterate over the same range as in the exercise above and print
       the square root of each number. You’ll need to type convert your loop constant.
       3. Above, you saw a for loop which iterated over only the even rows like so:
            var sum = 0
            for (row in 0 until 8) {
                if (row % 2 == 0) {
                continue
                }
                for (column in 0 until 8) {
                sum += row * column
                }
            }
    Change this to use a step clause on the first for loop to skip even rows instead of
    using continue. Check that the sum is 448 as in the initial example
   */

fun ForLoops(){
    val range = 1..10

    for(r in range) {
        println(sqrt(r.toDouble()))
    }

    var sum = 0
    for (row in 1 until 8 step 2) {

        for (column in 0 until 8) {
            sum += row * column
        }
    }
    println(sum)
}
