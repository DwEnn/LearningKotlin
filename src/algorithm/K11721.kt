package algorithm

import java.util.*

fun main(args: Array<String>) {

    val sc = Scanner(System.`in`)
    val inp = sc.nextLine()

    for (i in 0..(inp.length-1)) {
        if (i%10 == 0 && i != 0)
            println()
        print(inp[i])
    }

}