import kotlin.math.pow


fun main(){

    var fn:(a:Double,b:Double)->Double=::sum//function type we take a variable and give the function and declare a data type of function like we do in fn variable
    println(fn(2.0,6.0))

    //HigherOrder Function
    /*
    in Function we pass function as a argument or return or both

     */
     calculator(3.4,3.5,::sum)// passing function as a argument

}

fun sum(a:Double,b:Double):Double{
    return a+b
}


fun power(a:Double,b:Double):Double{
    return a.pow(b)
}
fun calculator(a:Double,b:Double,gn:(Double,Double)->Double){
    val result=gn(a,b)
    println(result)
}