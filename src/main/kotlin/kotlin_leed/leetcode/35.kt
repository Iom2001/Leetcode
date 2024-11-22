package kotlin_leed.leetcode

fun main() {
    println(searchInsert(intArrayOf(1, 3, 5, 6), 5)) // 2
    println(searchInsert(intArrayOf(1, 3, 5, 6), 2)) // 1
    println(searchInsert(intArrayOf(1, 3, 5, 6), 7)) // 4
    println(searchInsert(intArrayOf(1, 3), 4)) // 2
    println(searchInsert(intArrayOf(1, 3, 5), 4)) // 2
    println(searchInsert(intArrayOf(1,2,4,6,8,9,10), 10)) // 2
}
fun searchInsert(nums: IntArray, target: Int): Int {
    var low = 0
    var high = nums.size - 1

    while (low <= high) {
        val mid = low + (high - low) / 2
        when {
            nums[mid] == target -> return mid
            nums[mid] > target -> high = mid - 1
            else -> low = mid + 1
        }
    }

    return low
}