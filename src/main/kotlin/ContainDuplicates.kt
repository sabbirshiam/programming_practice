/*
* Given an integer array nums, return true if any value appears at least twice in the array, and return false if every element is distinct.
* Example 1:

Input: nums = [1,2,3,1]
Output: true
Example 2:

Input: nums = [1,2,3,4]
Output: false
 */

fun main(args: Array<String>) {
    val array1 = intArrayOf(1,2,3)
    val isContain = ContainDuplicates().containsDuplicate(array1)
    println(isContain)
}

class ContainDuplicates {

    fun containsDuplicate(nums: IntArray): Boolean {
        val map  = HashMap<Int, Boolean>()

        for (i in nums.indices) {
            map[nums[i]] = map.containsKey(nums[i])
        }

        return map.containsValue(true)
    }
}