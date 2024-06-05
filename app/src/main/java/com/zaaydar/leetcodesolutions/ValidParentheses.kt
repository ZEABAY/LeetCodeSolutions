package com.zaaydar.leetcodesolutions

import java.util.Stack

class ValidParentheses {
    fun isValid(s: String): Boolean {
        if (s.length % 2 != 0) return false
        val stack = Stack<Char>()
        val map: MutableMap<Char, Char> = mutableMapOf()
        map['('] = ')'
        map['['] = ']'
        map['{'] = '}'

        for (char in s) {
            if (map.containsKey(char)) stack.push(char)
            else return (stack.isEmpty() || map[stack.pop()] != char)
        }

        return stack.isEmpty()
    }
}
// time O(n)
// memory O(n)
// 20