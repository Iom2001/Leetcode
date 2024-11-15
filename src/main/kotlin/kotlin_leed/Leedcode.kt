package kotlin_leed

fun main() {
}

fun palindromeNumber(x: Int): Boolean {
    if (x == 0) return true
    if (x < 0 || x % 10 == 0) return false

    var original = x
    var reversedHalf = 0

    while (original > reversedHalf) {
        reversedHalf = reversedHalf * 10 + original % 10
        original /= 10
    }

    return original == reversedHalf || original == reversedHalf / 10
}

fun runningSum(nums: IntArray): IntArray {
    val array = IntArray(nums.size)
    for (i in nums.indices) {
        var sum = nums[i]
        for (j in 0 until i) {
            sum+=nums[j]
        }
        array[i] = sum
    }
    return array
}
fun runningSum2(nums: IntArray): IntArray {
    for (i in 1 until nums.size) {
        nums[i] = nums[i -1] + nums[i]
    }
    return nums
}