import java.util.Deque;
import java.util.LinkedList;

/*
 * @lc app=leetcode id=20 lang=java
 *
 * [20] Valid Parentheses
 *
 * https://leetcode.com/problems/valid-parentheses/description/
 *
 * algorithms
 * Easy (39.06%)
 * Likes:    5672
 * Dislikes: 237
 * Total Accepted:    1.1M
 * Total Submissions: 2.8M
 * Testcase Example:  '"()"'
 *
 * Given a string s containing just the characters '(', ')', '{', '}', '[' and
 * ']', determine if the input string is valid.
 * 
 * An input string is valid if:
 * 
 * 
 * Open brackets must be closed by the same type of brackets.
 * Open brackets must be closed in the correct order.
 * 
 * 
 * 
 * Example 1:
 * 
 * 
 * Input: s = "()"
 * Output: true
 * 
 * 
 * Example 2:
 * 
 * 
 * Input: s = "()[]{}"
 * Output: true
 * 
 * 
 * Example 3:
 * 
 * 
 * Input: s = "(]"
 * Output: false
 * 
 * 
 * Example 4:
 * 
 * 
 * Input: s = "([)]"
 * Output: false
 * 
 * 
 * Example 5:
 * 
 * 
 * Input: s = "{[]}"
 * Output: true
 * 
 * 
 * 
 * Constraints:
 * 
 * 
 * 1 <= s.length <= 10^4
 * s consists of parentheses only '()[]{}'.
 * 
 * "([)]"
 * 
 * |)]
 * 
 */

// @lc code=start
class Solution {
    public boolean isValid(String s) {
        if (s == null || s.length() == 0) {
            return false;
        }

        Deque<Character> stack = new LinkedList<>();
        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);
            if (ch == '(') {
                stack.offerLast(')');
            } else if (ch == '{') {
                stack.offerLast('}');
            } else if (ch == '[') {
                stack.offerLast(']');
            } else if (!stack.isEmpty() && stack.peekLast() == ch) {
                stack.pollLast();
            } else {
                return false;
            }
        }

        return stack.isEmpty();
    }
}
// @lc code=end

