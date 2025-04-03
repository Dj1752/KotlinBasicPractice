/*
Arrays
Object are store multiple values with same type
It has fixed size
 */

fun main(){

    var arr = arrayOf("one","two","three")
    var arr1 = arrayOf(1,2,3)
/*
    for(i in arr){ // only data has print
        println(i)
    }

 */
    for((i,e) in arr.withIndex()){/// data with index has print
        println("$i -- $e")
    }

    println(arr[0])//printing 0 index of arr
    println(arr.get(1))//printing 1 index of arr
    arr.set(2,"threeee")
    println(arr.get(2))//after updating data on index 2
    println(arr.size)//printing size


}