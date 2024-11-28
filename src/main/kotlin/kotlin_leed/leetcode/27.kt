package kotlin_leed.leetcode

fun main() {

}

fun removeElement(nums: IntArray, value: Int): Int {
    var remaining = nums.size
    var indexToSwap = nums.size - 1

    nums.forEachIndexed { i, num ->
        while (indexToSwap > -1 && nums[indexToSwap] == value) {
            nums[indexToSwap] = -1
            indexToSwap--
            remaining--
        }
        if (indexToSwap < i) {
            return remaining
        } else {
            if (indexToSwap > 0 && num == value) {
                nums[i] = nums[indexToSwap]
                nums[indexToSwap] = -1
                indexToSwap--
                remaining--
            }
        }
    }

    return remaining
}