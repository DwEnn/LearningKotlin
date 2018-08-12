package algorithm

import java.util.*

fun main(args: Array<String>) {
    val sc = Scanner(System.`in`)
    val n = sc.nextInt()
    sc.nextLine()
    val inp = sc.nextLine()

    var sum = 0
    for (i in inp)
        sum += i.toString().toInt()

    println(sum)
}