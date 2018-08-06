import java.util.*

fun main(args: Array<String>) {
    val sc = Scanner(System.`in`)

    while (sc.hasNextLine()) {
        val input = sc.nextLine()
        if (!(input.isEmpty()) || input.length > 100)
            println(input)
    }
}