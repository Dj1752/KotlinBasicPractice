import java.util.*


fun main(){
    var gender: String? = null//if i assigning null value to variable we have provide ? keyword to datatype

    if (gender != null) {//checking for null value
        println(gender.uppercase(Locale.getDefault()))
    }

    //other way to check null safety it is call safe call
    println(gender?.uppercase(Locale.getDefault()))//?. here it will check first if it is true the method is call else not called

    // if i want to print multiple line before that i want to check it is null or not we use let keyword

    gender?.let {
        println("Line 1")
        println("Line 2 $gender")
        println("Line 3 $it")
    }

    var selectedvalue:String = gender?:"NA"//it call Elvis operator if the data is null we are providing default value
    println(selectedvalue)





}