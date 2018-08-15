package algorithm

import java.util.*

fun main(args: Array<String>) {
    val sc = Scanner(System.`in`)
    val score = sc.nextInt()
    when(score) {
        in 90..100 -> println("A")
        in 80..89 -> println("B")
        in 70..79 -> println("C")
        in 60..69 -> println("D")
        else -> println("F")
    }
}