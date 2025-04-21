

fun main(){
    val emp = Employee()
    emp.name="Deepak"
    emp.id=2
    println(emp)

    emp.apply {
        id =3
        name="deepak3"
    }
    println("Apply :-"+emp)

   emp.let {
       println(it.name)
       println(it.id)
   }
    println("Let :-"+emp)
   val emp1:Employee?=null
    emp1?.id=5
    emp1?.name="Deepak5"
    //to simply the code of above we use .let function we dont need to check every time that is null or not we just check emp with null safety with let function
    emp1?.let {
        it.name="Deepakemp1"
        it.id=4
    }
    println("Let :-"+emp1)
    //we can also use with function here we dont need it keyword for reference
    with(emp){
        name ="Deepak6"
        id =6
    }
    println("With :-"+emp)
    //we also run function that is combine of both let and run
    emp.run {
        name="Deepak7"
        id=7
    }
    println("Run :-"+emp)

}

data class Employee(var id:Int=18,var name:String=""){}