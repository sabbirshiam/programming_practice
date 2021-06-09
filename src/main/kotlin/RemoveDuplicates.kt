/*
Given a sorted array nums, remove the duplicates in-place such that each element appears only once and returns the new length.


Do not allocate extra space for another array, you must do this by modifying the input array in-place with O(1) extra memory.
Example 1:

Input: nums = [1,1,2]
Output: 2, nums = [1,2]
Explanation: Your function should return length = 2, with the first two elements of nums being 1 and 2 res
 */


fun main(args: Array<String>) {
    val array1 = intArrayOf(1, 1, 2)
    val arrLength = RemoveDuplicates().removeDuplicates(array1)
    println(arrLength)
}

class RemoveDuplicates {

    fun removeDuplicates(nums: IntArray): Int {
        var count = 0
        for (i in nums.indices) {
            if (i < nums.size - 1 && nums[i] == nums[i + 1]) {
                continue
            }
            nums[count] = nums[i]
            count++
        }

        return count
    }
}