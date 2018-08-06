import java.util.*

fun main(args: Array<String>) {
    val sc = Scanner(System.`in`)
    var N = sc.nextInt()
    var count = 0

    while(true) {
        if(N%5 == 0){
            println(N/5 + count)
            break
        } else if (N <= 0){
            println("-1")
            break
        }

        N -= 3
        count ++
    }
}