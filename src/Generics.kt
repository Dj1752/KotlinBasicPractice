
fun main(){
   val intcont = IntContainer(1)//type dependent classes
  //  intcont.set(2)
    println( intcont.get())
    val cont = Container<Int>(5)// i can use same classes for String, boolean, Char
  //  intcont.set(2)
    println( cont.get())


}

class Container<T>(var a:T){//it is generic it is not a type dependent like others classes
    fun set(values:T){
       a=values
    }
    fun get():T{
        return a
    }
}


class IntContainer(var a:Int){
    fun set(values:Int){
        a=values
    }
    fun get():Int{
        return a
    }
}
class StringContainer(var a:String){
    fun set(values:String){
        a=values
    }
    fun get():String{
        return a
    }
}