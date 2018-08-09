package Inflearn

fun main(args: Array<String>) {

    // Underscores in numeric literals
//    Inflearn.numberLiterals()

    // Representation
//    Inflearn.representation()

    // Explicit Conversions
//    Inflearn.explicitConversions()

    // Characters
//    Inflearn.charTest('a')

    // Array
//    Inflearn.arrayTest()
//    Inflearn.arrayTest1()

    // String
//    Inflearn.strTest()
//    Inflearn.strTest1()

}

/*
    Underscores in numeric literals
 */

fun numberLiterals() {

    val oneMillion = 1_000_000
    val creditCardNumber = 1234_5678_9012_3456L
    val socialSecurityNumber = 999_99_9999L
    val hexBytes = 0xFF_EC_DE_5E
    val bytes = 0b11010010_01101001_10010100_10010010

    println(oneMillion)
    println(creditCardNumber)
    println(socialSecurityNumber)
    println(hexBytes)
    println(bytes)

}

/*
    Representation
 */

fun representation() {

    // JVM Primitive
    // primitive type 인 int 로 코딩 됨
    val a : Int = 100
    // '===' 같은 Object 인지 비교
    println(a === a) // prints 'true'

    // Boxed
    // Nullable 경우 Integer 로 박싱
    val boxedA : Int? = a
    val anotherBoxedA : Int? = a
    println("==: ${a == boxedA}")
    println("===: ${a === boxedA}")
    println("==: ${boxedA == anotherBoxedA}") // prints 'true'
    println("===: ${boxedA == anotherBoxedA}") // prints 'true'

}

/*
    Explicit Conversions
 */

fun explicitConversions() {
    // A boxed Int
    val a: Int = 1
    val b: Long = a.toLong()
    // 오류
//    println(a == b)

    // 명시적으로 변환을 해주어야함
    val i: Int = b.toInt()
    println(a == i)
}

/*
    문자 (Characters)
 */

fun charTest(c: Char) {

    // Error
//    if (c == 1) println(c)

    if (c == 'a')
        println(c)

    println('0'.toInt())

}

/*
    Array
 */

fun arrayTest() {
    val arr: Array<String> = arrayOf("코틀린", "강좌")
    println(arr.get(0))
    println(arr[0])
    println(arr.size)

    // 배열 생성
    val a = Array(6, {i -> i.toString()})
    val b = arrayOf("0", "1", "2", "3", "4", "5")

    for(i in a)
        print(i)
    println()

    for(i in b)
        print(i)
}

/*
    특별한 Array 클래스
 */

fun arrayTest1() {
    val x: IntArray = intArrayOf(1, 2, 3)
    x[0] = 7
    println(x.get(0))
    println(x[0])
    println(x.size)
}

/*
    String
 */

fun strTest() {
    val x: String = "Kotlin"
    println(x.get(0))
    println(x[0])
    println(x.length)

    for(c in x)
        println(c)
}

fun strTest1() {
    val s = "Hello, world!\n"
    val st ="""
        "'이것은 코틀린의
        raw String
        입니다.'"
    """.trimIndent()

    println(s)
    println(st)
}