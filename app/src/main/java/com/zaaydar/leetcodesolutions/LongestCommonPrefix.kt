package com.zaaydar.leetcodesolutions

class LongestCommonPrefix {
    // find the shortest
    // find the last index of shortest
    // return from 0 to last index in shortest
    fun longestCommonPrefix(strs: Array<String>): String {
        if (strs.size == 1) return strs[0]
        var shortest = strs.min()


        for (i in shortest.indices) {
            val char = shortest[i]
            for (str in strs) {
                if (str[i] != char) {
                    return shortest.substring(0, i)
                }
            }
        }
        return ""
    }
}
// time O(m * n)
// memory O(1)
// 14