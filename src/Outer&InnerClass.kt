

fun main(){

    val nested =Outer.nested()
    nested.test()
    val innernested =Outer().nested1()
    innernested.test1()

}

class Outer{
    val i=0
    class nested{// this is call nested class classes ke under classes but humlog outer class ke properties use nahi kar sakte hai and we call inner classes with outer classes
        fun test(){
            println("I am Nested class")
        }
    }
    inner class nested1{
         fun test1(){
            println("I am Nested class with inner class $i")// ider mai outer classes ki properties use kar sakta but jab mai call karunga inner classes ko to mujhe outer class ka object ke sath inner class ka object bana padega
        }
    }


}