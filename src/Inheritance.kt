/*
Code Reusability
open Keyword is use to define it is parent class
multiple classes can not be inherit
parent class constructor call first before child class constructor
 */

fun main(){
    val child = Child()
    child.open1()
    child.open()
    child.name="Deepak"
    child.name1="Deepak11"

println(child.name)
println(child.name1)

}
open class Parent{
    var name:String=""

    fun open(){
        println("Parent class")
    }
}
class Child:Parent(){
    var name1:String=""
    fun open1(){
        println("Child class")
    }
}