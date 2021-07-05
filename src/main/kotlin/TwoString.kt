/**
 * Given two strings, determine if they share a common substring. A substring may be as small as one character.
 *
 * Example:
 * Input
 * 2
    hello
    world
    hi
    world
output
    YES
    NO
 */


fun twoStrings(s1: String, s2: String): String {
    // Write your code here
    val setOne = s1.toHashSet()
    val setSecond = s2.toHashSet()
    val result = setOne.intersect(setSecond)

    if (result.isNotEmpty()) return "YES"

    return "NO"
}

fun main(args: Array<String>) {
    val q = readLine()!!.trim().toInt()

    for (qItr in 1..q) {
        val s1 = readLine()!!

        val s2 = readLine()!!

        val result = twoStrings(s1, s2)

        println(result)
    }
}