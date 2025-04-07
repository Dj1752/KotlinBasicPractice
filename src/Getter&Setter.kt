import java.util.*

/*
Lateinit is when need to initialized data in property for late then we use lateinit and it also be in var and cannot for data type like Integer,Floating and boolean
 */


/*
fun main(){

    val Cal = Calculator()
    println(Cal.add(2,5))//default constructor
    println(Cal.multiply(2,5))
}

class Calculator{

    lateinit var message:String

    fun add(a:Int,b:Int):Int{
        return a+b
    }
    fun multiply(a:Int,b:Int):Int{
        return a*b
    }
}


 */
/* Getter and Setter

 */
fun main(){

val p1=Personss("deepak",16)
    println(p1.age)
    p1.age =23
    p1.age = -17
    println(p1.name)
}
class Personss(nameparam:String,ageparam:Int){

    var name:String =nameparam
        get() {
            println("Getter us called")
            return field.uppercase(Locale.getDefault())
        }
    var age:Int = ageparam
        set(value){
            if (value>0){
                field = value
            }else{
                println("value is not proper")
            }
        }




}