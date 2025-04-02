//Operators
//        Arithmetic operators(+,-,*,%,/)
fun main(args:Array<String>){
    var i =3
    var j =4

    println(i+j)
    println(i-j)
    println(i*j)
    println(i/j)
    println(i%j)


    // Relation operators(<,>,<=,>=,!=,==)

    println(i>j)
    println(i<j)
    println(i>=j)
    println(i<=j)
    println(i!=j)
    println(i==j)

    //Incremental operators(++,--)
    //Pre and Post Incremenatal operators
    //pre(++i or ++i) here we first increment or decrement then execute
    //post(i++ or i++) here we first execute then increment or decrement

    println(++i)
    println(--i)

    println(j++)
    println(j--)
    println(j)

    //Logical operators(&&, ||, !)

    val israining = true
    val isnotraining = false
    val isitsunnyday = true

    println(israining && isnotraining)
    println(israining || isitsunnyday)
    println(!israining)


}