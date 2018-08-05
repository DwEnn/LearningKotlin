
fun main(args: Array<String>) {
    // 함수 정의
//    val a = 20
//    val b = 30
//    println(sum(a, b))
//    println(sum1(a, b))
//    printHelloWorld()
//    printHelloWorld1()

    // 문자열 템플릿
//    interpolation()

    // 조건문
//    val a = 30
//    val b = 20
//    println(maxOf(a, b))
//    println(maxOf1(a, b))

    // Nullable
//    printProduct("1", "1")
//    printProduct("1", "2")

    // 자동 타입 변환
//    println(getStringLength("Learning Kotlin"))
//    println(getStringLength("Learning Kotlin" + 102))
//    println(getStringLength(3321))

    // while loop
//    whileLoop()

    // when expression
//    println(describe(1))
//    println(describe("Hello"))
//    println(describe(3124L))
//    println(describe(1.302))
//    println(describe(null))

    // ranges
//    ranges()

    // collections
//    collections()
//    println()
//    collections1()

}

/*
    함수 정의
 */

fun sum(a: Int, b : Int): Int {
    return a + b
}

// 함수 몸체가 식(Expression)인 경우 return 생략 가능

fun sum1(a: Int, b: Int) = a + b

fun printHelloWorld(): Unit {
    println("Hello World !")
}

fun printHelloWorld1() {
    println("Hello World !")
}

/*
    지역 변수 정의
 */

fun localVariable() {
    val a: Int = 1 // 즉시 할당 Java 의 final 과 유사
    val b = 2 // Int type 추론
//    val c: Int // 컴파일 오류, 초기화 필요
//    c = 3   // 컴파일 오류, 읽기 전용
}

/*
    문자열 템플릿
 */

fun interpolation() {
    var a = 1
    val s1 = "a is $a"
    println(s1)
    a = 2
    val s2 = "${s1.replace("is", "was")}, but now is $a"
    println(s2)
}

/*
    조건문
 */

fun maxOf(a: Int, b: Int) : Int {
    if (a > b) {
        return a
    }
    else {
        return b
    }
}

// 조건식으로 사용 가능
fun maxOf1(a: Int, b: Int) = if (a > b) a else b

/*
    Nullable
 */

fun parseInt(str : String): Int? = if (str.equals("1")) 1 else null

fun printProduct(arg1 : String, arg2 : String) {
    val x : Int? = parseInt(arg1)
    val y : Int? = parseInt(arg2)

    if (x != null && y != null)
        println(x*y)
    else
        println("either $arg1 or $arg2 is not a number")
}

/*
    자동 타입 변환
 */

fun getStringLength(obj : Any) : Int? {
    if (obj is String){
        // obj 가 자동으로 String 타입으로 변환 됨
        return obj.length
    }

    return null
}

/*
    while loop
 */

fun whileLoop() {
    val items = listOf("apple", "banana", "kiwi")
    var index = 0
    while (index < items.size) {
        println("item at $index is ${items[index]}")
        index ++
    }
}

/*
    when expression
 */

fun describe(obj : Any?) : String =
        when (obj) {
            1 -> "One"
            "Hello" -> "Greeting"
            is Long -> "Long"
            !is String -> "Not a String"
            else -> "Unknown"
        }

/*
    ranges
 */

fun ranges() {
    val x = 3
    if(x in 1..10)
        println("fits in range")

    for (x in 1..5)
        println(x)
}

/*
    collections
 */

fun collections() {
    val items = listOf("apple", "banana", "kiwi")
    for(item in items)
        println(item)

    when {
        "orange" in items -> println("juicy")
        // when 안의 먼저 코딩된 문장이 실행
        "banana" in items -> println("banana is fine too")
        "apple" in items -> println("apple is fine")
    }
}

// 람다식을 이용해서 컬렉션에 filter, map 등의 연산 가능
fun collections1() {
    val fruits = listOf("banana", "avocado", "apple", "kiwi")
    fruits.filter { it.startsWith("a") }.sortedBy { it }.map { it.toUpperCase() }.forEach { println(it) }
}
