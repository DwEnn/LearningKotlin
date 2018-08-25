fun main(args: Array<String>) {
    test()
}

fun test() {
    val lt by lazy { LazyTest() }
    println(lt.lazyTest?.length)
    println()
}

class LazyTest {
    var lazyTest: String? = null
}