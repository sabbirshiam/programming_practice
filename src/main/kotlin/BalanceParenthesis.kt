fun main(args: Array<String>) {
    val n = "2"
    val str = CharArray(2 * n.toInt())
    printBalancedBrackets(str, n.toInt())
}

fun printBalancedBrackets(str: CharArray, pos: Int, n: Int, open: Int, close: Int) {
    if (close == n) {
        for (i in str.indices)
            print(str[i])
        println()
        return
    } else {
        if (open < n) {
            str[pos] = '('
            printBalancedBrackets(str, pos + 1, n, open + 1, close)
        }
        if (open > close) {
            str[pos] = ')'
            printBalancedBrackets(str, pos + 1, n, open, close + 1)
        }
    }
}

fun printBalancedBrackets(str: CharArray, n: Int) {
    if (n > 0)
        printBalancedBrackets(str, 0, n, 0, 0)
    return
}