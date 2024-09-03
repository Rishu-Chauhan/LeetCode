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
    public ListNode deleteDuplicates(ListNode head) {
       ListNode temp=head;
        ListNode prev=null;
        while(temp!=null && temp.next!=null){
            if(temp.val==temp.next.val){
                int val=temp.val;
                while(temp!=null && temp.val==val){
                    temp=temp.next;
                }
                
                if(prev!=null){
                    prev.next=temp;
                }
                else{
                    head=temp;
                }
            }
                else{
                    prev=temp;
                    temp=temp.next;
                }
            }
        
        
    return head;
    }
}