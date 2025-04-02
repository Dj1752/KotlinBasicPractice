//Function in Kotlin
//function is s set of instruction to  perform some task


//syntax

//fun name (input agruments){
//    //line of codes
//}

fun main(){
val result=add(3,4)
val result1=add(6,10)
    println(result)
    println(result1)
    evenorodd(12)
    evenorodd(15)
    printhello(5)
    printhello()
}
fun add(num1: Int, num2:Int):Int{
    val result = num1+num2
    return result
}
fun evenorodd(num1: Int){
    if (num1%2==0){
        println("it is even")
    }else{
        println("it is odd")
    }
}
fun printhello(count:Int=2){
    for (i in 1..count){
        println("Hello world"+" "+i)
    }
}
