//If Else
// * Base on condition i will perform some task

fun main(array: Array<String>){
//    val x =10
//    val y = 20
//
//    if (x>y){
//        println("x is greater then y")
//    }else{
//        println("y is greater then x")
//    }

   // elseif condition
   /* val x =10
    val y = 10

    if (x>y){
        println("x is greater then y")
    }else if(y>x){
        println("y is greater then x")
    } else{
        println("y is equal to  x")
    }
    */
    //expression

    val x =10
    val y = 10

    val result=if (x>y) {"x is greater then y"}
    else if(y>x) {"y is greater then x"}
     else{ "y is equal to  x"}

println(result)
}