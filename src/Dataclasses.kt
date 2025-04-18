/*
Data Class is like model file of java but in this we dont have to create a getter setter method, tostring, hashcode
It is basically use for store the data
 */

fun main(){
    val p1 = person(1,"John")
    val p2 = person(1,"John")

    println(p1)//tostring method call here
    println(p2)//tostring method call here
    println(p2.hashCode())
    println(p1 == p2)//equals method call

    val p3 = p1.copy()
    println(p3)//copy method is use to copy and paste same thing to other variables

    val(id: Int, name:String )=p1// destructed the p1 object
    println(id)
    println(name)
    println(p1.component1())
    println(p1.component2())
}


data class person(val id: Int ,val name:String){}
