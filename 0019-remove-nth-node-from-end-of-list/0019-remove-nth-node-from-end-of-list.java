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
class Solution {
    public ListNode removeNthFromEnd(ListNode head, int n) {

        int size = 0;
        
        ListNode sTemp = head;
        
        while(sTemp != null){
            size++;
            sTemp = sTemp.next;
        }

        if(size == n){
            return head.next;
        }

        int ele =size-n;
        
        ListNode temp = head;
        
        for(int i = 1 ; i < ele ; i++){
            
            temp = temp.next;
        }

        temp.next = temp.next.next;
        
        return head;
    }
}