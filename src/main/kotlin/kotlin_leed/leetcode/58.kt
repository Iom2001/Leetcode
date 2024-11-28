package kotlin_leed.leetcode

fun main() {

}

fun lengthOfLastWord(s: String): Int {
    val mS = s.trimEnd()
    var mSize = mS.length
    while (mSize > 0) {
        if (mS.substring(mSize - 1, mSize) == " ") {
                return mS.length - mSize - 1
        }
        mSize--
    }
    return mS.length
}