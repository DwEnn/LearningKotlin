package algorithm

import java.util.*

fun main(args: Array<String>) {
    val sc = Scanner(System.`in`)
    val inp = arrayOfNulls<Int>(3)

    for (i in inp.indices)
        inp[i] = sc.nextInt()

    inp.sort()
    println(inp[1])

}