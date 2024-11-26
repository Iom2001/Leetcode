package kotlin_leed.leetcode

fun main() {

}

fun strStr(haystack: String, needle: String): Int {
    val nLength = needle.length
    if (haystack.length < needle.length) return -1
    for (i in 0..haystack.length - nLength) {
        if (haystack.substring(i, i + nLength) == needle) {
            return i
        }
    }
    return -1
}