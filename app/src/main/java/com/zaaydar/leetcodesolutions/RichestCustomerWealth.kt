package com.zaaydar.leetcodesolutions

import kotlin.math.max

class RichestCustomerWealth {
    fun maximumWealth(accounts: Array<IntArray>): Int {
        var maxSum = 0

        for (acc in accounts) {
            var lastSum = 0
            for (money in acc) {
                lastSum += money
            }
            maxSum = max(maxSum, lastSum)
        }


        return maxSum
    }
}
// time o(n^2)
// memry O(1)
// 1672