/*
we cant use static keyword like java instead of that we use companion keyword in kotlin
 */


fun main(){
    obj.firstobj.a()//without companion keyword
    obj.b()//with companion keyword we dont need to give reference for object we can directly call method of Secondobj

}


class obj{
    object firstobj{
        fun a(){
            println("I am First object")
        }

    }
  companion  object Secondobj{
        fun b(){
            println("I am Second object")
        }

    }

}


