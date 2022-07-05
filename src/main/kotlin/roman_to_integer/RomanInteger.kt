package roman_to_integer

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
}

fun main() {
    val solution = Solution()
    println(solution.romanToInt("MCMXCIV"))
}