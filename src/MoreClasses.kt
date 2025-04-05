fun main(){
    var i : Int=20
    val p1 = Person("Deepak",i)
    println(p1.canvote())
    val p2 = Person("Sanket",17)
    val p3 = Person("Sankedddt",19)
    println(p2.canvote())
    println(p3.canvote())
}
class Person(val name:String,var age:Int){

   fun canvote():Boolean{
       return age>18
   }
}