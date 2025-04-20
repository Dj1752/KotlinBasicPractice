
/*
flter(),.map(),.foreach
 */

fun main(){

    val list = listOf(1,2,3,4,5)
    //i want to print odd number from list
    val rsult=list.filter(::odd)//using function
    println(rsult)
    val result1=list.filter(fun(a:Int):Boolean{return a%2 != 0})
    println(result1)
    val result2=list.filter { a: Int -> a % 2 != 0 }//lambda function
    println(result2)
    val result3=list.filter { it % 2 != 0 }//lambda function with it keyword
    println(result3)

    val userlist= listOf(
        User(1,"deepak1"),
        User(2,"deepak2"),
        User(3,"deepak3")
    )

    println( userlist.filter { it.id == 2 })

    val result4 = list.map { x:Int-> x*x}//map function use
    println(result4)


    val paidusers = userlist.map {
        Paiduser(it.id,it.name,"Paid")
    }
    println(paidusers)

    for (it in list){
        println(it)
    }

    list.forEach{println(it*2)}






}
fun odd(x:Int):Boolean{
    return x%2 != 0
}

data class User(val id:Int,val name:String)
data class Paiduser(val id:Int,val name:String,val paid:String)
