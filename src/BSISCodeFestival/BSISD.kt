package BSISCodeFestival

import java.util.*

fun main(args: Array<String>) {
    val sc = Scanner(System.`in`)

    val k = sc.nextLong()
    if (1 > k || k > 40000)
        throw Exception()
    println(getNum(k))

}

fun getNum(num: Long): Long {
    var count: Long = 0
    var i: Long = 1
    while (true) {
        for (j in 2..i) {
            if (i % j == 0L) {
                if (i == j) {
                    count++
                }
                break
            }
        }
        if (count == num) {
            return i
        }
        i ++
    }
}

//fun getNum(num: Long): Long {
//    var count: Long = 0
//    var i: Long = 1
//    while (true) {
//        for (j in 2..i) {
//            if (i % j == 0L) {
//                if (i == j) {
//                    print("$i\t")
//                    count++
//
//                    if (count%8 == 0L)
//                        println()
//
//                }
//                break
//            }
//        }
//
//        if (count == num) {
//            return i
//        }
//        i ++
//    }
//}
