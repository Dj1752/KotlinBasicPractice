/*
Constructor
It has two type of constructor
Primary and secondary constructor

 */

fun main(){
    val car = Cars("A",4,4,"Petrol")
    val car1 = Cars("A",4,4,"Petrol")
    val car2 = Cars("A","Petrol")
    println(car.name)
    println(car1.name)
    println(car2.wheel)
}

class Cars(val name:String,val seat:Int,val wheel:Int,val type:String){//primary constructor

    constructor(namecus:String,typeCus:String)//secondary constructor
            :this(namecus,4,6,typeCus)


}