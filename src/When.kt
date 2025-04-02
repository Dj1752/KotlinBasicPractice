//Range
/*
it is use for identify that my value is that range or not.
we use "in" and "until"
in "In" keyword my uperbound range is included  (eg:- 1...5 ) 1,2,3,4,5
whereas in until the uperbound range is not included(eg:- 1 until 5) 1,2,3,4

*/


fun main(array: Array<String>){
 val number = 5
    //val result = number in 1..5//true(we use range without until)
    val result = number in 1 until 5//false(we use range with until)
    println(result)

    val animal = "Dog"
    //When :- it is like a switch

    when(animal){
        "Hours"-> println("the animal is horse")
        "Cat"-> println("the animal is Cat")
        "Dog"-> println("the animal is Dog")
        "Lion"-> println("the animal is Lion")
        else-> println("Animal not Found")
    }

    //When with expression
    val drink = "Water"
    val results:String =  when(drink){
        "Water"-> "the Drink is Water"
        "Cocola"-> "the Drink is Cocola"
        "Sprite"-> "the Drink is Sprite"
        "Lemonjuice"-> "the Drink is Lemonjuice"
        else-> "Drink not Found"
    }
    println(results)

}
