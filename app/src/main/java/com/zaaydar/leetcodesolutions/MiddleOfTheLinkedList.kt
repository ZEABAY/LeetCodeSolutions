package com.zaaydar.leetcodesolutions

class MiddleOfTheLinkedList {

    fun middleNode(head: ListNode?): ListNode? {
        if (head == null) return null
        var currentNode = head
        var middleNode = head
        var nodeCount = 0
        while (currentNode?.next != null) {
            currentNode = currentNode.next
            nodeCount++
        }

        nodeCount = if (nodeCount % 2 == 0) nodeCount / 2 else (nodeCount + 1) / 2

        for (i in 1..nodeCount) {
            middleNode = middleNode?.next
        }
        return middleNode
    }

    class ListNode {
        var next: ListNode? = null
    }

}
// time O(n)
// memory O(1)
// 876
