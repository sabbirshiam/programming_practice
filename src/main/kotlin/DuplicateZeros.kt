/**
 * Given a fixed length array arr of integers, duplicate each occurrence of zero, shifting the remaining elements to the right.
 * Note that elements beyond the length of the original array are not written.
 * Do the above modifications to the input array in place, do not return anything from your function.
 * Input: [1,0,2,3,0,4,5,0]
 * Output: null
 * Explanation: After calling your function, the input array is modified to: [1,0,0,2,3,0,0,4]
 */

fun main() {
    val array1 = intArrayOf(1, 0, 2, 3, 0, 4, 5, 0)
    DuplicateZeros().duplicateZeros(array1)
}

class DuplicateZeros {
    fun duplicateZeros(arr: IntArray): Unit {
        var visited = false
        arr.forEachIndexed { index, value ->
            if (value == 0 && !visited) {
                visited = true
                for (subIndex in arr.lastIndex - 1 downTo index) {
                    arr[subIndex + 1] = arr[subIndex]
                }
            } else if (value == 0 && visited) visited = false
        }
    }
}