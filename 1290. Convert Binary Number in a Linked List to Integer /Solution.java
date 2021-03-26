/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */

class Solution {
    public int getDecimalValue(ListNode head) {

        int ret = 0;

        while (head != null) {
            ret*=2;
            ret+=head.val;
            head = head.next;
        }

        return ret;
    }
}