 /*
 OOPS
 Kotlin is a object oriented language
 paradigm which is allow to solve the problem by creating object which represent the real world entities

 Class And Object

 Class is the blueprint
 Object are the real thing
 you Create a object in your program to interact with other object to complete the task or job.
  */

 fun main(){
   val mustang = Car("Mustang","Petrol",170)
     println(mustang.name)

     mustang.drvicecar()
 }
 class Car(val name:String,val type:String,var speed:Int ){
     fun drvicecar(){
         println("$name Car is driving")
     }


 }

