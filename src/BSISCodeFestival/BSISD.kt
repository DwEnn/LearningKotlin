package BSISCodeFestival

import java.util.*

fun main(args: Array<String>) {
    val sc = Scanner(System.`in`)

    println(getNum(sc.nextInt()))

}

fun getNum(num: Int): Int {
    var count = 0
    var i = 1
    while (true) {
        for (j in 2..i) {
            if (i % j == 0) {
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
