package com.example.kt

fun main(args: Array<String>) //maina
{
  /*  //Variables
    var a = 30
    var b = 40
    var c = a + b

    val age = 20 //constant cant be reassigned

    println(c) //sout */

    //Data Types

    /*var myAge: Int = 20
    var myName: String = "Oscar Diaz"
    var isTrue: Boolean = true
    var deposit: Double = 300.27
    var transfer: Float = 3000.292F
    var letter: Char = 'A'
    var byte: Byte = 12
    var short: Short = 430
    var l: Long = 3646L

    println(letter)*/

  /*  //Type Conversion
    /*
    * toByte()
    * toInt()
    * toDouble()
    * toFloat()
    * toShort()
    * toLong(0*/

    var i: Int = 20
    var d: Double = i.toDouble()*/

  /*  //String Methods

    var myAge: Int = 20
    var s: String = " Hey "

    println("My age is " + myAge) //Concatenation
    println(s.length)
    println(s.isEmpty())
    println(s.uppercase())
    println(s.lowercase())
    println(s.trim())
    println(s.equals("Java"))
    println(s.plus("Kotlin"))*/

  /*  //ArrayList

    var numbers = ArrayList<Int>()

    numbers.add(20)
    numbers.add(30)
    numbers.add(40)
    numbers.add(3, 50)

    numbers.remove(40)

    println(numbers[0])
    println(numbers.get(1))

    println("Third Element ${numbers[2]}") //concatenation
    println(numbers.size)

    var nums = arrayListOf<Int>(30,40,50) //Another way of ArrayList

    nums.add(60)

    var mixTypes = ArrayList<Any>()  //Any Data Types together

    mixTypes.add("Hey")
    mixTypes.add(20)
    mixTypes.add(20.66)*/

    /*//User Input
    println("Please enter your age: ")
    var myAge: Int = readLine()!!.toInt()

    if(myAge < 18)
    {
        println("You are a child")
    }
    else if(myAge == 18)
    {
        println("You are qualified to take an id.")
    }
    else{
        println("You are an adult")
    }*/

    /*//when statement

    var dayNum: Int = 5

    when(dayNum)
    {
        1 -> println("Monday")
        2 -> println("Tuesday")
        3 -> println("Wednesday")
        4 -> println("Thursday")
        5 -> println("Friday")
        6 -> println("Saturday")
        7 -> println("Sunday")
        else -> println("Invalid day choice")
    }*/

   /* //Do While Loop

    var number: Int  = 1

    do {
        println(number)
        number++
    }while (number <= 20)*/

    //Function / method

    //addNum(2,15)

    var example  =  Example("Oscar", 23) //Object
    var example2 = Example2("Oscar", 34) //the set method is
// generated automatically in kotlin , so you can assign new values later


}

/*fun addNum(num1: Int, num2: Int): Int {
    var total:Int = num1 + num2
    return total
}*/
