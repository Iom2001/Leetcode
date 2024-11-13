package kotlin_leed

fun main() {
    println(palindromeNumber(0))
    println(palindromeNumber(111))
    println(palindromeNumber(121))
    println(palindromeNumber(-121))
    println(palindromeNumber(10))
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