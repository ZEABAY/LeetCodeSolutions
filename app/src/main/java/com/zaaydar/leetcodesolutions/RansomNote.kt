package com.zaaydar.leetcodesolutions

class RansomNote {
    fun canConstruct(ransomNote: String, magazine: String): Boolean {
        var str = magazine
        for (char in ransomNote) {
            if (str.contains(char)) str = str.replaceFirst(char.toString(), "")
            else return false
        }
        return true
    }


}
// time O(m*n)
// memory O(m*n)
// 383
// !! dont evet use contains or replacefirst