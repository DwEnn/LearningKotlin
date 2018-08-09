package BSISCodeFestival

import java.util.*

fun main(args: Array<String>) {

    val sc = Scanner(System.`in`)

    val A = sc.nextInt()
    val B = sc.nextInt()

    if (A > 1000 || B > 1000)
        throw Exception("OverFlow")

    val sum = (A+B)*(A-B)
    println(sum)
}