package com.zaaydar.leetcodesolutions


class RomanToInteger {
    fun romanToInt(s: String): Int {
        val romanValues: HashMap<Char, Int> = object : HashMap<Char, Int>() {
            init {
                put('I', 1)
                put('V', 5)
                put('X', 10)
                put('L', 50)
                put('C', 100)
                put('D', 500)
                put('M', 1000)
            }
        }
        var romanToInt = romanValues[s[s.length - 1]]!!

        for (i in s.length - 2 downTo 0) {
            if (romanValues[s[i]]!! < romanValues[s[i + 1]]!!) {
                romanToInt -= romanValues[s[i]]!!
            } else {
                romanToInt += romanValues[s[i]]!!
            }
        }

        return romanToInt
    }
}
// time O(n)
// memory O(1)
// 13
