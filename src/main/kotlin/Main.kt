import kotlin.math.pow

fun main() {
    println(isPalindrome(10))
}

fun twoSum(nums: IntArray, target: Int): IntArray {
    for (i in nums.indices) {
        for (j in i + 1 until nums.size) {
            if (nums[i] + nums[j] == target) return intArrayOf(i, j)
        }
    }
    return intArrayOf(0, 1)
}

fun isPalindrome(x: Int): Boolean {
    if (x < 0) return false
    val length = x.toString().length
    val halfLength = x.toString().length / 2
    for (i in 0 until halfLength) {
        val firstFirstStep: Int = x / 10.0.pow(length - i).toInt()
        val firstSecondStep = firstFirstStep - (firstFirstStep / 10) * 10
        val secondFirstStep: Int = x - (x / 10.0.pow(i).toInt()) * 10.0.pow(i).toInt()
        val secondSecondStep = secondFirstStep / 10.0.pow(i).toInt()
        if (firstSecondStep != secondSecondStep) return false
    }
    return true
}

class Car(var doors: Int)

fun printCar2(car: Car?) {
    val isCoupe = car?.run {
        (doors <= 2)
    }
    if (isCoupe == true) {
        println("Coupes are awesome")
    }
}

fun printCar3(car: Car?) {
    car?.also {
        it.doors = 4
    }.let {
        if (it?.doors != null && it.doors <= 2) {
            println("Coupes are awesome")
        }
    }
}