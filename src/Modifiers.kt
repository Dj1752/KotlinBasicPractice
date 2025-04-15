/*
Modifiers
public can access anywhere
private can access with in the class
protected can access in subclass
internal access with in a module
 */

fun main(){
   var b:B=B();
     b.test()
}

/*
//top level Declarations
class A
var b = 10

fun B(){

}

 */

// Class Member
open class A{
    public var a="Pu"
    private var pr="Pr"
    internal var iner="Internal"
    protected var pro="protected"
}

class B:A(){
    fun test(){
        println(a)//no error because we can use public modifiers in anywhere
       // println(pr)// error because we can't use private modifiers in outside the class
        println(iner)//no error because we can use internal modifiers in module
        println(pro)//no error because we can use protected modifiers in subclass
    }
}


