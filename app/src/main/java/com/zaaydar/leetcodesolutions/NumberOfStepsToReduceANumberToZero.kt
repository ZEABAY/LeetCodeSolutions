package com.zaaydar.leetcodesolutions

class NumberOfStepsToReduceANumberToZero {
    fun numberOfSteps(num: Int): Int {
        // fun parameters are val
        var tmpNum = num

        var step = 0
        while (tmpNum != 0) {
            if (tmpNum % 2 == 0) tmpNum /= 2
            else tmpNum -= 1

            step++
        }



        return step
    }
}
// time O(n)
// memory O(1)
// 1342