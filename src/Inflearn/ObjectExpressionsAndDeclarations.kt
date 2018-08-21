package Inflearn

fun main(args: Array<String>) {

//    exTest()
//    exTest1()
//    exTest2()
//    exTest4()
    exTest6()

}

fun exTest() {
//    val t = Thread( MyRunnable() )
//    t.run()

//    val mr = MyRunnable()
//    mr.run()

    val mr = Thread( object : Runnable {
        override fun run() {
            println("Hello Kotlin")
        }
    })

}

class MyRunnable : Runnable {
    override fun run() {
        println("Hello Kotlin")
    }
}

/*
    람다 표현식으로 전환
 */

fun exTest1() {
    val mr = Thread(Runnable { println("Hello Kotlin") })
    mr.run()

    // 이와 같이 축약 가능
    val mr1 = Thread { println("Hello Kotlin") }
    mr1.run()

    val myObj = object : Runnable {
        override fun run() {
            println("Hello Kotlin")
        }
    }

    val t = Thread(myObj)
    t.run()
}

/*
    객체 표현식 상속 없는 경우
 */

fun exTest2() {
    val data = object {
        var x = 1
        var y = 1
    }

    println("x = ${data.x}, y = ${data.y}")

    val data1 = object {}
    println(data1)
}

/*
    객체 표현식 제약 사항
 */

fun exTest3() {

}

class exT3 {
    private fun foo() = object { val x: String = "x" }
    fun publicFoo() = object { val x: String = "x" }

    fun bar() {
        val x1 = foo().x
        // Error Unresolved reference: x
//        val x2 = publicFoo().x
    }
}

/*
    객체 선언 문법
 */


class DataProvider {
    object DataPro {
        fun registerDataPro(provider : DataProvider) {}
        val allDataProviders : Collection<DataProvider>? = null
    }
}

fun exTest4() {
    // 직접 접근
    DataProvider.DataPro.registerDataPro(DataProvider())
}

object CountManager {
    var count = 0
}

fun exTest5() {
    println(CountManager)

    CountManager.count ++
    println(CountManager.count)
    CountManager.count ++
    println(CountManager.count)
    CountManager.count ++
    println(CountManager.count)
}

/*
    동반자 객체
 */

class MyClass {
    companion object Factory {
        fun create() : MyClass = MyClass()
    }

    val instance = MyClass.create()
}

class MyClass1 {
    companion object {
        var count = 1
    }

    val instance = MyClass1.Companion.count
    val instance1 = MyClass1.count
}

interface Factory<T> {
    fun create() : T
}

class MyClass2 {
    companion object : Factory<MyClass2> {
        override fun create(): MyClass2 = MyClass2()
    }
}

object MC1 {

}

object MC2 {

}

object MC3 {

}

fun exTest6() {
    println(1)
    println(MC1)
    println(2)
    println(MC2)
    println(3)
    println(MC3)
    println(4)
}

