package BSISCodeFestival

import java.util.*

fun main(args: Array<String>) {

    val sc = Scanner(System.`in`)

    val A = sc.nextLong()
    val B = sc.nextLong()

    val sum = (A+B)*(A-B)
    println(sum)
}
