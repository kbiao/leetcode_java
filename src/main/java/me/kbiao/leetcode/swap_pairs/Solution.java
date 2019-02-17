/**
 * Leetcode - swap_pairs
 */
package me.kbiao.leetcode.swap_pairs;
import com.ciaoshen.leetcode.util.ListNode;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

interface Solution {

    // use this Object to print the log (call from slf4j facade)
    static Logger log = LoggerFactory.getLogger(Solution.class);

    ListNode swapPairs(ListNode head);
}
