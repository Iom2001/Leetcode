package kotlin_leed.roman_to_integer

class Solution {
    private var i = 1
    private var result = 0
    fun romanToInt(s: String): Int {
        while (i < s.length) {
            sum(s[i - 1].code, s[i].code)
        }
        if (i == s.length)
            sum(s[i - 1].code, 0)
        return result
    }

    private fun sum(code1: Int, code2: Int) {
        when (code1) {
            77 -> {
                result += 1000
            }
            68 -> {
                result += 500
            }
            67 -> {
                when (code2) {
                    77 -> {
                        result += 900
                        i++
                    }
                    68 -> {
                        result += 400
                        i++
                    }
                    else -> {
                        result += 100
                    }
                }
            }
            76 -> {
                result += 50
            }
            88 -> {
                when (code2) {
                    67 -> {
                        result += 90
                        i++
                    }
                    76 -> {
                        result += 40
                        i++
                    }
                    else -> {
                        result += 10
                    }
                }
            }
            86 -> {
                result += 5
            }
            73 -> {
                when (code2) {
                    88 -> {
                        result += 9
                        i++
                    }
                    86 -> {
                        result += 4
                        i++
                    }
                    else -> result += 1
                }
            }
        }
        i++
    }

    fun romanToInt2(s: String): Int {
        var start = s.length - 1
        while (start >= 0) {
            println(start)
            sum2(s[start].code)
            println(result)
            start--
        }
        return result
    }

    private fun sum2(code: Int) {
        when (code) {
            77 -> {
                result += 1000
            }
            68 -> {
                result += 500
            }
            67 -> {
                result += if (result < 300) 100 else -100
            }
            76 -> {
                result += 50
            }
            88 -> {
                result += if (result < 30) 10 else -10
            }
            86 -> {
                result += 5
            }
            73 -> {
                result += if (result < 3) 1 else -1
            }
        }
    }
}

fun main() {
    val solution = Solution()
    println(solution.romanToInt2("MCMXCIV"))
}