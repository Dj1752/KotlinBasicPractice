/*
Abstract Method

Class can't be instantiated
abstract class can have both abstract and non_abstract properties & methods
if a class has abstract method or property then class must be declared as abstract
 */


fun main(){
    val circles = Circless(4.0)
    println(circles.area())
    circles.display()

}

abstract class shapess(){
  abstract  fun area():Double
   abstract fun display()

}

class Circless(val radius:Double):shapess(){
  override  fun area():Double{
        return Math.PI*radius*radius
    }

  override  fun display(){
        println("Dissplay shape")
    }
}


