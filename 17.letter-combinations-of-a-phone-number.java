import java.util.ArrayList;
import java.util.List;

/*
 * @lc app=leetcode id=17 lang=java
 *
 * [17] Letter Combinations of a Phone Number
 *
 * https://leetcode.com/problems/letter-combinations-of-a-phone-number/description/
 *
 * algorithms
 * Medium (47.05%)
 * Likes:    4418
 * Dislikes: 442
 * Total Accepted:    663.4K
 * Total Submissions: 1.4M
 * Testcase Example:  '"23"'
 *
 * Given a string containing digits from 2-9 inclusive, return all possible
 * letter combinations that the number could represent.
 * 
 * A mapping of digit to letters (just like on the telephone buttons) is given
 * below. Note that 1 does not map to any letters.
 * 
 * 
 * 
 * Example:
 * 
 * 
 * Input: "23"
 * Output: ["ad", "ae", "af", "bd", "be", "bf", "cd", "ce", "cf"].
 * 
 * 
 * Note:
 * 
 * Although the above answer is in lexicographical order, your answer could be
 * in any order you want.
 * 
 * 
 * 2(abc)3(def)
 * 
 * 
 *0       a            b              c
 *1   ad  ae af     bd be bf      cd  ce  cf
 * 
 */



// @lc code=start


class Solution {
    String[] nums = {"", "", "abc", "def", "ghi", "jkl", "mno", "pqrs", "tuv", "wxyz"};
    public List<String> letterCombinations(String digits) {
        List<String> res = new ArrayList<>();
        if (digits == null || digits.length() == 0) {
            return res;
        }
        dfs(res, digits, 0, new StringBuilder());
        return res;
    }

    private void dfs(List<String> res, String digits, int index, StringBuilder sb) {
        if (index == digits.length()) {
            res.add(sb.toString());
            return;
        }

        int digit = Character.getNumericValue(digits.charAt(index));
        String numbers = nums[digit];
        for (int i = 0; i < numbers.length(); i++) {
            sb.append(numbers.charAt(i));
            dfs(res, digits, index + 1, sb);
            sb.deleteCharAt(sb.length() - 1);
        }
    }
}
// @lc code=end

