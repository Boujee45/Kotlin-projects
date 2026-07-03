package com.example.kt

class Example constructor(name: String, age: Int) { //Primary Constructor
    //var name: String? = null
    init {  //Enables to write code in a primary constructor
        println("My name is ${name} and am ${age} years old.")
    }
}