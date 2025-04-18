/*
with try it should always company with catch or finally we can give multiple catch to a single try

 */

fun main(){
    var arr = arrayOf(1,2,3)
    //println(arr[5])// with exception handling my application can crash
//    try {
//        println(arr[5])
//    }catch (e:Exception){
//        println("The array size is wrong please check it")
//    }finally {
//        println("I will execute whether it valid or not ")
//    }
//    println("This is Exception handling code")

    countlist(2)
    countlist(-1)

}

fun countlist(count:Int){
    if (count<0){
        throw IllegalArgumentException("Please provide proper count")//if it is wrong input then it will throw an exception
    }else{
        println("$count this is count")
    }
}