/*
Object Declaration

Class and its Single Object is Created Once
No constructor is required
Singleton pattern
you can inherit class/interface
 */

fun main(){

    /*
println(girl.ac)

    boy.print()

     */
/*
    var textscore  = object:tests{//object with expression
        override fun test() {
          println("i am clone")
        }

    }
    textscore.test()


 */

    var test = object : Personsss("name"){
        override fun fullname() {
            super.fullname()
            println("anonymous - $name")
        }
    }
    test.fullname()

}
/*
Object Declarartion
object girl{//Object declaration
    val ac:Int =10
}
object boy{
    val b =20
    fun print(){
        println("I am boy object")
    }

}

 */

interface tests{
    fun test()
}

open class Personsss(val name:String){
    open fun fullname()= println("Fullname  -  $name")

}