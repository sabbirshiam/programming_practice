/**
 * There is a large pile of socks that must be paired by color.
 * Given an array of integers representing the color of each sock, determine how many pairs of socks with matching colors there are.
 * STDIN                       Function
-----                       --------
9                           n = 9
10 20 20 10 10 30 50 10 20  ar = [10, 20, 20, 10, 10, 30, 50, 10, 20]

output:
3
 */


fun sockMerchant(n: Int, ar: Array<Int>): Int {
    // Write your code here

    val map = HashMap<Int, Int>()
    ar.forEach {
        map[it] = map[it]?.plus(1) ?: 1
    }
    var count = 0
    map.forEach {
        val value = it.value
        if (value > 1 && value % 2 == 0)
            count += value / 2
        else if (value > 1 && (value - 1) % 2 == 0)
            count += (value - 1) / 2
    }

    return count
}

fun main(args: Array<String>) {
    val n = readLine()!!.trim().toInt()

    val ar = readLine()!!.trimEnd().split(" ").map { it.toInt() }.toTypedArray()

    val result = sockMerchant(n, ar)

    println(result)
}