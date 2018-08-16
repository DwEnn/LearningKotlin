package algorithm

import java.util.*
import kotlin.math.round

fun main(args: Array<String>) {
    val sc = Scanner(System.`in`)
    val c = sc.nextInt()
    val printArr = arrayOfNulls<Double>(c)

    for (i in 1..c) {
        val n = sc.nextInt()
        val scoreArr = arrayOfNulls<Int>(n)
        var sum = 0

        for (j in scoreArr.indices) {
            scoreArr[j] = sc.nextInt()
            sum += scoreArr[j]!!
        }
        val avg = sum/n
        var count = 0

        for (j in scoreArr){
            if (j != null){
                if (j > avg)
                    count ++
            }
        }

        printArr[i-1] = round((count.toDouble()/n.toDouble()*100*1000))/1000
//        println("${round((count.toDouble()/n.toDouble()*100*1000))/1000}%")
    }

    for (i in printArr)
        println("${String.format("%.3f", i)}%")

}