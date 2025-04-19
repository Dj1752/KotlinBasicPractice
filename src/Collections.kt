/*
List and Map
both have two types mutable and immutable

 */

fun main(){
/*
    val list = mutableListOf(1,2,3)//mutable list we can change the data, add, edit or remove the data
    list.add(3,4)
    println(list)
    list.removeAt(2)
    println(list)
    println(list.contains(1))

 */
    /*
    val list = listOf(1,2,3)
    //list.add// we cant call add method in immutable list it is throwing error
    println( list.contains(3))
    println(list)

     */

    /*
    Map(here we use key value pair to store the data

     */
    /*
    val map = mutableMapOf<Int,String>()// mutable map we can add,remove,update the data
    map.put(1,"Deepak")
    map.put(2,"Deepak2")
    map.put(3,"Deepak3")
    map.put(4,"Deepak4")
    println(map)
    map.remove(3)
    println(map)

     */

    val map = mapOf<Int,String>((1 to "Deepak"),(2 to "Deepak2"))//we cant add directly here because immutable state we use to keyword
     println(map)
    println( map.get(1))
    println( map.get(11))
    for ((key,value) in map){
        println("$key - $value")
    }



}