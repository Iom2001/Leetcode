package kotlin_leed.leetcode

fun canConstruct(ransomNote: String, magazine: String): Boolean {
    val magazineLetters: HashMap<Char, Int> = HashMap() // k = 26
    for (i in magazine.indices) {
        val m = magazine[i]
        val currentCount = magazineLetters[m] ?: 0
        magazineLetters[m] = currentCount + 1
    }

    // bounded by m
    for (i in ransomNote.indices) {
        val r = ransomNote[i]
        val currentCount = magazineLetters[r] ?: 0
        if (currentCount == 0) {
            return false
        }
        magazineLetters[r] = currentCount - 1
    }
    return true

    // time complexity = O(m)
    // space complexity = O(k) -> O(1)
}