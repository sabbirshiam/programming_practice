/*
* Given a signed 32-bit integer x, return x with its digits reversed. If reversing x causes the value to go outside the signed 32-bit integer range [-231, 231 - 1], then return 0.
* Assume the environment does not allow you to store 64-bit integers (signed or unsigned).
*/


fun main(args: Array<String>) {
    val input = "1534236469".toInt()
    val result = ReverseInteger().reverse(input)
    print(result)
}

class ReverseInteger {
    fun reverse(x: Int): Int {

        var number = x
        var isNegative = false

        if (number < 0) {
            number *= -1
            isNegative = true
        }

        var reverse = 0L

        while (number > 0) {
            val lastDigit = number % 10
            reverse = reverse * 10 + lastDigit
            number /= 10
        }
        if (isNegative) reverse *= -1
        if (reverse > Integer.MAX_VALUE || reverse < Integer.MIN_VALUE) return 0
        return reverse.toInt()
    }
}