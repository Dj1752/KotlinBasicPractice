

fun main(){

    val oneplus = Oneplus("Oneplus")
    oneplus.display()
    println(oneplus.size)
    println(oneplus.toString())
}

open class mobile(val nameparam:String){//parameterized constructor
   open val name:String="Mobile"
    open val size:Int =6
    open fun display()= println("Mobile class")
}

class Oneplus(nameparam: String):mobile(nameparam){

    override val name: String="OnePlus"// i am using same parameter and method which i am overriding from parent with the help override keyword
    override val size: Int=5
    override fun display() {
        super.display()//display parent then child method
        println("One plus display")
    }

    override fun toString(): String {//Any override which have predefine methods
        return "Oneplus(name='$name', size=$size)"
    }


}
