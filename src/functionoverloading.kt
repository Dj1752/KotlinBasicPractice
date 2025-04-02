//Function Overloading
//it is have same name as function but have different parameter
//Either number of parameter is different Or DataType is Different


fun main(){
//println(addition(5,6))
//    println(addition(5.0,6.0))
//    println(addition(5.0,6.0,7.0))

    var fn = ::addition//we can store function in variable with help this method
    println(fn(6,5))

}

//fun addition(a: Int, b:Int):Int{//DataType is Different
//    return a+b
//}
//fun addition(a: Double, b:Double):Double{//DataType is Different
//    return a+b
//}
//
//fun addition(a: Double, b:Double, c:Double):Double{//  number of parameter is different
//    return a+b+c
//}

fun addition(a: Int, b:Int):Int{
    return a+b
}


