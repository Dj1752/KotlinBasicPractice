/*
in this parent method can be override with same name in child class
when i am calling circle.area() i am refer to parent class that is shape but i am create object of child class

Advantage

Helps to write Maintainable and Extensible code
helps in interacting with object via common interface

 */


fun main(){
    val circle:Shape=Circle(4.0)
    val suqare:Shape=Suqare(3.0)

//    println(circle.area())
//    println(suqare.area())
    val shapes = arrayOf(Circle(3.4),Suqare(6.0))
    calculate(shapes)
}

fun calculate(shape:Array<Shape>){
    for (shapes in shape){
        println(shapes.area())
    }
}

open class Shape{
    open fun area():Double{
        return 0.0
    }
}

class Circle(val radius:Double):Shape(){
   override fun area():Double{
        return Math.PI*radius*radius
    }
}
class Suqare(val side:Double):Shape(){
    override fun area():Double{
        return side*side
    }
}


