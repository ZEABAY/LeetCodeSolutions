package com.zaaydar.leetcodesolutions

class IsPalindrome {

    fun isPalindrome(x: Int): Boolean {

        // negative will never be true
        if (x < 0) return false


        // This doesnt work because some reverse of integers are bigger than maxInt
        // return x == x.toString().reversed().toInt()
        // need to check the string values

        return x.toString() == x.toString().reversed()
    }

}
// time complexity O(n)
// memory complexity O(n)
// 9