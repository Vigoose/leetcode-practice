/*
 * @lc app=leetcode id=2 lang=java
 *
 * [2] Add Two Numbers
 *
 * https://leetcode.com/problems/add-two-numbers/description/
 *
 * algorithms
 * Medium (34.02%)
 * Likes:    8997
 * Dislikes: 2269
 * Total Accepted:    1.5M
 * Total Submissions: 4.4M
 * Testcase Example:  '[2,4,3]\n[5,6,4]'
 *
 * You are given two non-empty linked lists representing two non-negative
 * integers. The digits are stored in reverse order and each of their nodes
 * contain a single digit. Add the two numbers and return it as a linked list.
 * 
 * You may assume the two numbers do not contain any leading zero, except the
 * number 0 itself.
 * 
 * Example:
 * 
 * 
 * Input: (2 -> 4 -> 3) + (5 -> 6 -> 4)
 * Output: 7 -> 0 -> 8
 * Explanation: 342 + 465 = 807.
 * 
 * 
 */

// @lc code=start
/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */

/* Input: (5 -> 4 -> 3)
                l1
          (5)
                l2

          0
          head
          res: 1
// Output: 7 -> 0 -> 8
*Explanation: 342 + 465 = 807
*/ 
class Solution {
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        if (l1 == null || l2 == null) {
            return null;
        }

        ListNode dummy = new ListNode(0);
        ListNode head = dummy;
        int res = 0;
        while (l1 != null && l2 != null) {
            int val = l1.val + l2.val + res;
            res = val / 10;
            int add = val % 10;
            head.next = new ListNode(add);
            l1 = l1.next;
            l2 = l2.next;
            head = head.next;
        }

        while (l1 != null) {
            
        }

        return dummy.next;
    }
}
// @lc code=end

