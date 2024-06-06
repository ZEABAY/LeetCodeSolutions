package com.zaaydar.leetcodesolutions

class MergeTwoSortedLists {
    class ListNode(var `val`: Int) {
        var next: ListNode? = null
    }

    fun mergeTwoLists(list1: ListNode?, list2: ListNode?): ListNode? {
        val resultList = ListNode(0)
        var current = resultList

        var firstLsit = list1
        var secondList = list2

        while (firstLsit != null && secondList != null) {
            if (firstLsit.`val` <= secondList.`val`) {
                current.next = firstLsit
                firstLsit = firstLsit.next
            } else {
                current.next = secondList
                secondList = secondList.next
            }
            // never will be null in if or else it will be set
            current = current.next!!
        }

        // add the rest of list remains
        if (firstLsit == null) current.next = secondList
        if (secondList == null) current.next = firstLsit

        return resultList.next
    }
}

// time O(n)
// memory O(1)
// 21