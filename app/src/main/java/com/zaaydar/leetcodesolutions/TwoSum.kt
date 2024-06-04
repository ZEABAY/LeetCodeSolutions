package com.zaaydar.leetcodesolutions


class TwoSum {
    fun twoSum(nums: IntArray, target: Int): IntArray? {
        // i solved this in java , ill just convert
        val hashMap: MutableMap<Int, Int> = HashMap()

        for (i in nums.indices) {

            val search = target - nums[i]

            if (hashMap.containsKey(search)) {
                // !! is not safe but it will never be null so can be used
                return intArrayOf(hashMap[search]!!, i)
            }

            hashMap[nums[i]] = i
        }
        // if array contains twoSum of a target this will never work
        return null
    }
}
// time complexity O(n)
// memory complexity o(1)
// 1