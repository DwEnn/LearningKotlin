package BSISCodeFestival

import java.util.*
import kotlin.collections.ArrayList
import kotlin.collections.HashMap

fun main(args: Array<String>) {
    val sc = Scanner(System.`in`)
    val n = sc.nextInt()
    val arr = arrayOfNulls<Int>(n)

    for (i in arr.indices) {
        arr[i] = sc.nextInt()
    }

    val ar = HashMap<Int, String>()

    for(i in arr)
        print("$i ")

}

//fun getNum(n: Int): Int {
//
//}