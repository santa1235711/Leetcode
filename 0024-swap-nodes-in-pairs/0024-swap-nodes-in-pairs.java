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
    public ListNode swapPairs(ListNode head) {
        ListNode store = new ListNode();
        ListNode store2=store;
        ListNode buffer =new ListNode();
        buffer=buffer.next;
        int count=0;
        while(head!=null)
        {
            ListNode temp=new ListNode(head.val);
            temp.next=buffer;
            buffer=temp;
            count++;
            if (count==2)
            {
                count=0;
                store.next=buffer;
                store=store.next.next;
                buffer=buffer.next.next;
            }
            head=head.next;


        }
       if (buffer!=null)
        store.next=buffer;
        store2=store2.next;
        return store2;

        
    }
}