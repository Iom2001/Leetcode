package kotlin_leed.longest_common_prefix

import kotlin_leed.isPalindrome

class LongEstCommonPrefix {

    fun longestCommonPrefix(strs: Array<String>): String {
        return ""
    }
}

fun main() {
    println(removeDuplicates(intArrayOf(1, 1, 1, 2, 3, 6, 8, 8, 9, 10)))
    println(removeDuplicates(intArrayOf(1,2,3,4,5,5)))
    println(removeDuplicates(intArrayOf(1, 1, 1, 2, 2,3,70,80,90)))
}

fun removeDuplicates(nums: IntArray): Int {
    var count = 1
    for (i in 1 until nums.size) {
        if (nums[i] != nums[i -1]) {
            nums[count] = nums[i]
            count++
        }
    }
    return count
}