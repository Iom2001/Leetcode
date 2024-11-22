package kotlin_leed.leetcode

import kotlin.math.abs


fun main() {
    println(reverse(-123))
    println(reverse2(-123))
}
fun reverse(x: Int): Int {
    var start = abs(x)
    var end = 0L
    while (start != 0) {
        end = end * 10 + start % 10
        start /= 10
    }
    if (end > Int.MAX_VALUE || end < Int.MIN_VALUE) {
        end = 0
    }
    return end.toInt()
}

fun reverse2(x: Int): Int {
    var num = x
    var reversed: Long = 0L

    while (num != 0) {
        val digit = num % 10
        reversed = reversed * 10 + digit
        if (reversed > Int.MAX_VALUE || reversed < Int.MIN_VALUE) {
            return 0 // Exit early if overflow occurs
        }
        num /= 10
    }

    return reversed.toInt()
}