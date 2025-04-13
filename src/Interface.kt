


fun main(){
    dragobject(arrayOf(Circlesss(4.0),Squaress(2.4),Triangless(3.0,4.0)))
}


fun dragobject(objects:Array<Shapes>){
    for (obj in objects){
        obj.drag()
    }
}

abstract class Shapes{
    abstract  fun area():Double
    abstract fun drag()
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


