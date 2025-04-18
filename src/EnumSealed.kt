/*
Enum is a set of data that we will assign to variables  in enum we dont set any random value
 */
/*
fun main(){
val days = Days.Sunday
    println(days)
    println(days.number)
    days.dayss()
}

enum class Days(val number: Number){
    Sunday(1),
    Monday(2),
    Tuesday(3),
    Wednesday(4),
    Thursday(5),
    Friday(6),
    Saturday(7);

    fun dayss(){
        println("Days is $this")
    }


}

 */

/*
Sealed
 */

fun main(){
  val p1:Tile = Red("Mashroom",100)
//  val p2 = Blue(100)
//    println("${p1.type},${p1.point}")
   val points = when(p1){
       is Blue -> p1.point*3
       is Red -> p1.point*7
   }
    println(points)

}

sealed class Tile
class Red(val type:String, val point:Int): Tile()
class Blue(val point:Int):Tile()