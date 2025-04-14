fun main(){
   val circle = Circlesss(4.0)
    val player = player("Deepak")

//   if (circle is Circle){//run time type checking of data
//       println("This is Circle")
//   }
    
    val arr: Array<Any> = arrayOf(circle,player,Test())//type casting

    for (obj in arr){
        if (obj is Circlesss){
            println(obj.area())
        }else{
            (obj as player).myName()
        }
        }
    }



interface Dargger{
    fun drag()
}

abstract class Shapes:Dargger{
    abstract  fun area():Double
    // abstract fun drag()
}

class Circlesss(val radiu:Double):Shapes(){
    override fun area():Double = Math.PI*radiu*radiu
    override fun drag()=println("Circle is Dragging ")
}

class player(val name:String):Dargger{
    override fun drag()= println("$name is Dargging")
    fun myName()= println("Hey my name is - $name")
}
class Test{

}




