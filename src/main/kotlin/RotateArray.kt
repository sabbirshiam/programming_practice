/*
Given an array, rotate the array to the right by k steps, where k is non-negative.

Example #1
------------
Input: nums = [1,2,3,4,5,6,7], k = 3
Output: [5,6,7,1,2,3,4]
Explanation:
rotate 1 steps to the right: [7,1,2,3,4,5,6]
rotate 2 steps to the right: [6,7,1,2,3,4,5]
rotate 3 steps to the right: [5,6,7,1,2,3,4]

Example#2
-----------
Input: nums = [-1,-100,3,99], k = 2
Output: [3,99,-1,-100]
Explanation:
rotate 1 steps to the right: [99,-1,-100,3]
rotate 2 steps to the right: [3,99,-1,-100]
 */

fun main(args: Array<String>) {
    val nums1 = intArrayOf(-1, -100, 3, 99)
    val nums2 = intArrayOf(1, 2, 3, 4, 5, 6, 7)
    val nums3 = intArrayOf(-1) //k = 2
    val nums4 = intArrayOf(1,2) // k = 3
    val k = 3
    RotateArray().rotate(nums2, k)
}

class RotateArray {
    fun rotate(nums: IntArray, k: Int) {
        val length = nums.size
        if (length == 1) {
            print(nums.toList())
            return
        }

        val tempArray = nums.toMutableList()

        for (i in 0 until k) {
            val lastValue = tempArray[tempArray.lastIndex]
            tempArray.add(0, lastValue)
            tempArray.removeAt(tempArray.lastIndex)
        }
        for (index in tempArray.indices) {
            nums[index] = tempArray[index]
        }

        print(nums.toList())
    }
}