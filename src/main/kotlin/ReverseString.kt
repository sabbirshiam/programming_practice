/*
* Write a function that reverses a string. The input string is given as an array of characters s.
* Input: s = ["h","e","l","l","o"]
* Output: ["o","l","l","e","h"]
 */


fun main(args: Array<String>) {
    val input = "Hello".toCharArray()
    ReverseString().reverseString(input)
}


class ReverseString {

    fun reverseString(s: CharArray): Unit {
        for ((front, rear) in (s.lastIndex downTo s.size / 2).withIndex()) {
            val tempItemRear = s[rear]
            val tempItemFront = s[front]
            s[front] = tempItemRear
            s[rear] = tempItemFront
        }

        print(s)
    }
}