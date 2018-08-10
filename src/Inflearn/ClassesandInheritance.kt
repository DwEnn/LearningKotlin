package Inflearn

fun main(args: Array<String>) {

    // Class
//    val inV = Invoice(1)
//    val emp = EmptyTest()

    // 기본 생성자
//    val p = Person("Learning")
//    val p1 = Person1("Kotlin")
//    val p2 = Person2("Learning Kotlin")
//    val p3 = Person3("Kotlin")
//    val p4 = Person4("Learning", "Kotlin")
//    println("FirstName : ${p4.firstName}, LastName : ${p4.lastName}")
//    p4.firstName = "Kotlin"
//    p4.lastName = "Learning"
//    println("FirstName : ${p4.firstName}, LastName : ${p4.lastName}")
//
//    val p5 = Person5()
//    p5.name = "Kotlin"

    // 보조 생성자
//    val c1 = Customer1("Kotlin", "Learning")
//    println(c1.name)

}

/*
    Class
 */

class Invoice(data: Int) {

}

class EmptyTest

/*
    기본 생성자
 */

class Person constructor(firstName: String) {

}

class Person1 (firstName: String) {

}

class Person2 (name: String) {
    init {
        println("Person2 initialized with value $name")
    }
}

class Person3 (name: String) {
    private val personKey = name.toUpperCase()
    init {
        println(personKey)
    }
}

class Person4 (var firstName: String, var lastName: String){

//    init {
//        println("First Name : $firstName, LastName : $lastName")
//    }

}

class Person5 () {
    var name: String = ""
        get() { return field }
        set(value) { field = value }
}

//class Person6 private @Inject constructor(name: String) {
//
//}

/*
    보조 생성자
 */

class Customer {
    constructor(parent: Person) {
//        parent.children.add(this)
    }
}

class Customer1 (val name: String) {
    // 직접적
    constructor(name: String, firstName: String): this(name)
    // 간접적
    constructor(): this("Kotlin", "Learning")
}

/*
    생성된 기본 생성자
 */

class Customer2 (){

}

class Customer3 private constructor() {

}