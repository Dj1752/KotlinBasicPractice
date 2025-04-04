//Loops
// Execute set of statement multiple times with the help of condition
/*
While loop
we use while loop if we know the range of data and it will first check the condition and
execute the statement

Whereas in do while

it will execute the statement and then check  condition
 */


fun main(){
var count = 6
/*
    while (count >=1){
        println(count)
        count--
    }


    do {
        println(count)
        count--
    }while (count >=1)

 */


    //For loop
    //What is the role of range(..,until,downTo and Step)
/*
    for (i in 1..5){
        println(i)
    }
    println("Until")

    for (i in 1 until 5){
        println(i)
    }
    println("Steps")//use to increment the data by 2
    for (i in 1..5 step 2){
        println(i)
    }
    println("downTo")//use to reveres the data

    for (i in 10 downTo 1){
        println(i)
    }

 */
    //create a table for 2 with help of for loop
    val number = 2
   /*
    for (i in 1..10){
        println(i*number)
    }

    */
    for (i in 1..10){
        println("$number * $i = " + i*number)
    }

}