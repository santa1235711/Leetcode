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
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        int c =0,sum=0,d=0;
        
    ListNode store =new ListNode(0);
        
        ListNode ulta= store;
        
        while (l1!=null||l2!=null||c!=0){
            int d1=(l1==null)? 0:l1.val;
            int d2=(l2==null)? 0:l2.val;
            sum=d1+d2+c;
            d=sum%10;
            c=sum/10;
            
            ulta.next=new ListNode(d);
            ulta=ulta.next;
            l1=(l1==null)? null:l1.next;
            l2=(l2==null)? null:l2.next;
            
         
        }
        ulta=store.next;
        return ulta;
        
        
    }
}