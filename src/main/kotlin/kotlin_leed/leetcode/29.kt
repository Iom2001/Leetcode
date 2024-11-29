package kotlin_leed.leetcode

import kotlin.math.abs

fun main() {
    println(divide(2147483647, -1))
}
fun divide(dividend: Int, divisor: Int): Int {
    // Handle edge case for overflow
    if (dividend == Int.MIN_VALUE && divisor == -1) {
        return Int.MAX_VALUE
    }

    // Determine the sign of the result
    val negative = (dividend < 0) xor (divisor < 0)

    // Work with absolute values to simplify the calculation
    var dividendAbs = abs(dividend.toLong())
    val divisorAbs = abs(divisor.toLong())

    var count = 0

    // Perform subtraction until the dividend is less than the divisor
    while (dividendAbs >= divisorAbs) {
        var tempDivisor = divisorAbs
        var multiple = 1

        // Optimize by doubling the divisor and tracking the multiple
        while (dividendAbs >= (tempDivisor shl 1)) {
            tempDivisor = tempDivisor shl 1
            multiple = multiple shl 1
        }

        // Subtract the largest multiple of the divisor
        dividendAbs -= tempDivisor
        count += multiple
    }

    // Apply the sign to the quotient
    return if (negative) -count else count
}
