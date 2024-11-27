package kotlin_leed.leetcode

import kotlin.math.abs

fun main() {
    println(divide(2147483647, -1))
}
fun divide(dividend: Int, divisor: Int): Int {
    var mDividend = dividend.toLong()
    var mDivider = divisor.toLong()
    mDividend = abs(mDividend)
    mDivider = abs(mDivider)
    var count = 0L
    while (mDividend >= mDivider) {
        mDividend -= mDivider
        count++
    }
    if (dividend < 0 && divisor < 0) {
        return if (count > Int.MAX_VALUE) Int.MAX_VALUE
        else count.toInt()
    } else if (dividend < 0 || divisor < 0) {
        if (count <= Int.MAX_VALUE) return (-count).toInt()
        else return Int.MIN_VALUE
    }
    return if (count > Int.MAX_VALUE) Int.MAX_VALUE
    else count.toInt()
}
