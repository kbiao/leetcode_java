/**
 * Leetcode - swap_pairs
 */
package me.kbiao.leetcode.swap_pairs;
import com.ciaoshen.leetcode.util.ListNode;

/** 
 * log instance is defined in Solution interface
 * this is how slf4j will work in this class:
 * =============================================
 *     if (log.isDebugEnabled()) {
 *         log.debug("a + b = {}", sum);
 *     }
 * =============================================
 */
class Solution1 implements Solution {

    @Override
    public ListNode swapPairs(ListNode head) {

        if(head == null || head.next == null) {
            return head;
        }
        ListNode cur = head ;
        ListNode res = head.next;
        while(cur != null && cur.next != null ){
            ListNode nex = cur.next.next;
            ListNode a = cur;
            ListNode b = a.next;
            b.next = a;
            a.next = nex;
            cur = a.next;

        }
        return res;
    }

}
