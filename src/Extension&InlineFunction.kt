/*
fun main(){
    println("Hello Deepak".formateString())///.formateString method is extention method we use on String object
}

fun String.formateString():String{
    return "------------------\n $this \n----------------------"
}

 */

fun main(){
    calculatetimetake {loop(100000)}
}
inline fun calculatetimetake(fn:()->Unit){//inline keyword is use to avoid the creating in instance of object and it improve the performance of code
    val start = System.currentTimeMillis()
    fn()
    val end = System.currentTimeMillis()
    println("Time Taken ${end-start} ms")
}

fun loop(x:Long){
    for (i:Long in 1..x){
        //loop
    }
}