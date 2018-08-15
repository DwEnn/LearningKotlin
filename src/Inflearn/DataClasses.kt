package Inflearn

fun main(args: Array<String>) {

    mkUser1()

}

/*
    Data Class
 */

data class User(val name: String, val age: Int)

/*
    기본 값
 */

data class User1(val name: String = "", val age: Int = 0)
data class User2(val name: String, val age: Int)
class User4(var name: String, var age: Int)

fun mkUser1() {

    val ex = User1()
    val ex1 = User1("Kotlin")
    val ex2 = User1("Kotlin", 13)
    val ex3 = User1(age = 13)
    val ex4 = User1(name = "Kotlin", age = 13)

    val ex5 = User2("Kotlin", 13)
    val ex6 = ex5.copy()
    // 일부 값만 변경
    val ex7 = ex5.copy("Learning")
    val ex8 = User4("Kotlin", 13)

    println(ex5)
    println(ex6)
    println(ex7)
    println(ex8)

    // Destructuring Declarations
    val jane = User2("Jane", 23)
    val janesAge = jane.age
    println(janesAge)
    val (name, age) = User2("Jane", 24)
    println("$name, $age")
    val (name1, age1) = jane
    println("$name1, $age1")

    // Standard Data Classes
    val jane1 = User2("Jane", 23)
    println(jane1) // User(name=Jane, age=23)
    val pair = Pair("Jane", 23)
    println(pair)   // (Jane, 23)

}

/*
    Nested Classes
 */

class Outer {
    private val bar: Int = 1

    class Nested {
        fun foo() = 2
    }
}

fun nestedTest() {
    val demo = Outer.Nested().foo()
}

/*
    Inner Class
 */

class Outer1 {
    private val bar: Int = 1
    inner class Inner {
        fun foo() = bar
    }
}

fun innerTest() {
    val demo = Outer1().Inner().foo()   // == 1
}
