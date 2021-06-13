/**
 * Given an integer array nums sorted in non-decreasing order, return an array of the squares of each number sorted in non-decreasing order.
 * Example 1:
 * Input: nums = [-4,-1,0,3,10]
 * Output: [0,1,9,16,100]
 * Explanation: After squaring, the array becomes [16,1,0,9,100].After sorting, it becomes [0,1,9,16,100].
 */

fun main(args: Array<String>) {
    val numbers = intArrayOf(-7, -3, 2, 3, 11)
    val sqrOfSortedArray = SquaresOfSortedArray()
    val count = sqrOfSortedArray.sortedSquares(numbers)
    println(count.toList())

}

class SquaresOfSortedArray {
    fun sortedSquares(nums: IntArray): IntArray {
        val tempArray = IntArray(nums.size)
        nums.forEachIndexed { index, value ->
            tempArray[index] = value * value
        }
        return tempArray.sortedArray()
    }
}