package Inflearn
fun main(args: Array<String>) {

    // if else
//    Inflearn.ifElseTest()

    // when
//    Inflearn.whenTest(1)
//    Inflearn.whenTest(2)
//    Inflearn.whenTest(3)
//    Inflearn.whenTest1(80, true)
//    Inflearn.whenTest2(0, "0")
//    Inflearn.whenTest2(1, "2")
//    Inflearn.whenTest3(3)
//    Inflearn.whenTest4("Learning Kotlin")
//    println(Inflearn.whenTest4("Learning Kotlin"))

    // for loop
//    Inflearn.forTest()
//    Inflearn.forTest1()
    forTest2()

}

/*
    if else
 */

fun ifElseTest() {
    val a = 10
    val b = 5

    val max = if(a > b) a else b
    println(max)
    println()

    val max1 = if(a > b){
        println("Choose a")
        a
    }else {
        println("Choose b")
        b
    }
    println(max1)
}

/*
    when
 */

fun whenTest(x: Int) {
    println("====== when Test ========")

    when(x) {
        1 -> println("x == 1")
        2 -> println("x == 2")
        else -> {
            // Note the block
            println("x is neither 1 nor 2")
        }
    }
}

fun whenTest1(x: Int, y: Boolean) {
    println("====== when Test 1 ========")

    val res = when(x) {
        100 -> "A"
        90 -> "B"
        80 -> "C"
        else -> "F"
    }
    println(res)

    val res1 = when(y){
        true -> "맞다"
        false -> "틀리다"
    }
    println(res1)
}

fun whenTest2(x: Int, y: String) {
    println("====== when Test 2 ========")

    when (x) {
        0, 1 -> println("x == 0 or x == 1")
        else -> println("otherWise")
    }

    when (x){
        parseInt(y) -> print("s encodes x")
        1 + 3 -> println(4)
        else -> println("s does not encode x")
    }
}

fun whenTest3(x: Int) {
    println("====== when Test 3 ========")

    val validNumbers = listOf(3, 6, 9)
    when (x) {
        in validNumbers -> println("x is valid")
        in 1..10 -> println("x is in the range")
        !in 10..20 -> println("x is outside the range")
        else -> println("none of the above")
    }
}

fun whenTest4(x: Any) = when(x) {
    is String -> {
        println("is String")
        x.startsWith("Learning")
    }
    else -> {
        println("else branch")
        false
    }
}

/*
    for loop
 */

fun forTest() {
    val collections = listOf<Int>(1, 2, 3, 4, 5)
    collections.iterator()
    for (item in collections)
        println(item)

    val array = arrayOf(1, 2, 3, 4, 5)
    array.iterator()
    for (i in array)
        println("$i : $array[i]")
}

fun forTest1() {
    val myData: MyData = MyData()
    for (item in myData)
        print(item)
}

class MyIterator {
    val data = listOf<Int>(1, 2, 3, 4, 5)
    var idx = 0
    operator fun hasNext(): Boolean {
        return data.size > idx
    }

    operator fun next(): Int {
        return data[idx++]
    }
}

class MyData {
    operator fun iterator(): MyIterator {
        return MyIterator()
    }
}

fun forTest2() {
    val arr = arrayOf("가", "나", "다")
    for (i in arr.indices)
        println("$i: ${arr[i]}")
    println()

    for ((index, value) in arr.withIndex())
        println("$index: $value")
}

/*
    while loops
 */

fun whileTest() {
    var x = 10
    while (x > 0) {
        println(x)
        x --
    }
    println()

    do{
        val y = 10
    } while (y > 0) // 'y' is visible here
}