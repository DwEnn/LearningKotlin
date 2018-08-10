package BSISCodeFestival

import java.util.*
import kotlin.collections.ArrayList

fun main(args: Array<String>) {
    val sc = Scanner(System.`in`)
    val n = sc.nextInt()
    val arr = arrayOfNulls<Int>(n)

    for (i in arr.indices) {
        arr[i] = sc.nextInt()
    }

    println(getNum(arr))
}

fun getNum(arr: Array<Int?>): Int? {
    val array = arrayOfNulls<Int>(arr.size)
    for (i in arr.indices) {
        val comp = ArrayList<Int>()
        comp.add(arr[i]!!)
        var count = 0
        for (j in i..(arr.size-1)) {
            if (arr[j] == comp[count].plus(1)) {
//                comp[++count] = arr[j]!!
                comp.add(arr[j]!!)
                count++
            }
        }

//        for (k in comp)
//            print("$k ")
//
//        println()
        array[i] = comp.size
    }

    array.sort()

    return array[array.size-1]
}