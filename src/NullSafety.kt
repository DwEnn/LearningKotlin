fun main(args: Array<String>) {

    elvisOperator()

}

fun elvisOperator() {
    val b: String? = null

    val l : Int = if(b != null ) b.length else -1

    val l1 = b?.length ?: -1
}