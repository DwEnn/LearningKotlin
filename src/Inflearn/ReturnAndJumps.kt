package Inflearn

fun main(args: Array<String>) {

    // Return and Jumps
//    Inflearn.returnTest(10, 20)
//    Inflearn.breakTest()
//    Inflearn.continueTest()

    // label
//    Inflearn.labelTest()
//    Inflearn.labelTest1()
//    Inflearn.labelTest2()
//    Inflearn.labelTest3()
    labelTest4()

}

/*
    Return and Jumps
 */

fun returnTest(a: Int, b: Int): Int {
    println("a: $a, b: $b")
    return a + b
}

fun breakTest() {
    for (x in 1..10){
        if (x > 2) {
            println("x > 2 break")
            break
        }
        println("x: $x")
    }
}

fun continueTest() {
    for (x in 1..10) {
        if (x < 2) {
            println("x < 2 continue")
            continue
        }
        println("x: $x")
    }
}

/*
    label
 */

fun labelTest() {
    loop@ for (i in 1..10) {
        println("--- i: $i ---")

        for (j in 1..10) {
            println("j: $j")
            if (i + j > 12) {
                println("break loop@ : i + j = ${i+j}")
                break@loop
            }
        }
    }
    println()

    loop1@ for (i in 1..10){
        println("--- i: $i ---")

        for (j in 1..10) {
            if (j < 2) {
                println("continue loop@ : j = $j")
                continue@loop1
            }
            println("j: $j")
        }
    }
}

fun labelTest1() {
    val ints = listOf<Int>(0, 1, 2, 3)
    ints.forEach(fun (value: Int) {
        if (value == 1) return
        print(value)
    })
    println("End")

    ints.forEach {
        if (it == 1) return
        print(it)
    }
    println("End")
}

fun labelTest2() {
    val ints = listOf<Int>(0, 1, 2, 3)
    ints.forEach label@ {
        if (it == 1) return@label
        print(it)
    }
    println("End")
}

fun labelTest3() {
    val ints = listOf<Int>(0, 1, 2, 3)
    ints.forEach {
        if (it == 1) return@forEach
        print(it)
    }
    println("End")
}

fun labelTest4(): List<String> {
    val ints = listOf<Int>(0, 1, 2, 3)
    val result = ints.map {
        if (it == 0)
            return@map "zero"
        "number $it"
    }
    return result
}

