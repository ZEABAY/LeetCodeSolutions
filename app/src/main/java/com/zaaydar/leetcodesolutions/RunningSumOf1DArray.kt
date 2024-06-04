package com.zaaydar.leetcodesolutions

class RunningSumOf1DArray {
    fun runningSum(nums: IntArray): IntArray {

        for ((index) in nums.withIndex()) {
            if (index != 0) nums[index] += nums[index - 1]
        }

        return nums
    }
}

// https://leetcode.com/problems/running-sum-of-1d-array/
// time complexity O(n)
// memory complexity o(1)