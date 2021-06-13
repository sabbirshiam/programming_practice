/*
* Given an array nums of integers, return how many of them contain an even number of digits.
* Example 1:
* Input: nums = [12,345,2,6,7896]
* Output: 2
* Explanation:
* 12 contains 2 digits (even number of digits).
* 345 contains 3 digits (odd number of digits).
* 2 contains 1 digit (odd number of digits).
* 6 contains 1 digit (odd number of digits).
* 7896 contains 4 digits (even number of digits).
* Therefore only 12 and 7896 contain an even number of digits.
*/


fun main(args: Array<String>) {
    val numbers = intArrayOf(437, 315, 322, 431, 686, 264, 442)//12, 345, 2, 6, 7896)
    val evenNumberOfDigits = EvenNumberOfDigits()
    val count = evenNumberOfDigits.findNumbers(numbers)
    println(count)

}

class EvenNumberOfDigits {
    fun findNumbers(nums: IntArray): Int {
        var numberOfDigit = 0
        var count = 0
        for (num in nums) {
            var temp = num
            while (temp > 0) {
                temp /= 10
                numberOfDigit++
            }
            if (numberOfDigit % 2 == 0) count++
            numberOfDigit = 0
        }
        return count
    }
}