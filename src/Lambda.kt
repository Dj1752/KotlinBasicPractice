

fun main(){
    val lambda={x:Int->x+x}//implicit lambda
    println(lambda(2))
    val lambda1: (Int) -> Int ={ x->x+x}//explicit lambda
    println(lambda1(4))
    val multilinelambda={
        println("Hello Deepak")
        2
    }
    println(multilinelambda())


}