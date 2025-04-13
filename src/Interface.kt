/*
Group object base on what they can do rather than what they are
to use polymorphism in unrelated set of classes(i.e classes which dont belong to same inheritance hierarchy
Interface are meant for behaviors.Classes which exhibits that behavior implements that interface.

Interface can have both abstract and concrete methods
Interface can implement other interface and one class can implement manny interface but classes can have only one superclass
 */


fun main(){
    dragobject(arrayOf(Circlesss(4.0),Squaress(2.4),Triangless(3.0,4.0)
        ,player("Deepak")))
}


fun dragobject(objects:Array<Dargger>){
    for (obj in objects){
        obj.drag()
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
class Squaress(val area:Double):Shapes(){
    override fun area():Double = 0.5*area*area
    override fun drag()=println("Square is Dragging ")
}

class Triangless(val heigth:Double,val breath:Double):Shapes(){
   override fun area():Double = 0.5*heigth*breath
    override fun drag()=println("Triangle is Dragging ")
}

class player(val name:String):Dargger{
   override fun drag()= println("$name is Dargging")
}



