fun main(args: Array<String>) {

//    test()
    test1()
}

fun test() {
    val lt by lazy { LazyTest() }
    println(lt.lazyTest?.length)
    println()
}

class LazyTest {
    var lazyTest: String? = null
}

fun test1() {
    val str = "str"
    val str1 = "str1".let { println(it) }

    println(str)
    println(str1)
}

data class ClassTest(var name: String?)

fun test2() {

}