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

fun maximumWealth(accounts: Array<IntArray>): Int {
    var max = 0
    for (i in accounts.indices) {
        var value = 0
        for (j in accounts[i].indices) {
            value+=accounts[i][j]
        }
        if (value > max) {
            max = value
        }
    }
    return max
}

fun fizzBuzz(n: Int): List<String> {
    val answer = ArrayList<String>(n)
    var i = 1
    while (i <= n) {
        val fizz = i % 3 == 0
        val buzz = i % 5 == 0
        if (fizz && buzz) {
            answer.add("FizzBuzz")
        } else if (fizz) {
            answer.add("Fizz")
        } else if (buzz) {
            answer.add("Buzz")
        } else {
            answer.add("$i")
        }
        i++
    }
    return answer
}

fun numberOfSteps(num: Int): Int {
    var second = num
    var step = 0
    while (second > 0) {
        if (second % 2 == 0) {
            second /= 2
        } else {
            second -= 1
        }
        step++
    }
    return step
}