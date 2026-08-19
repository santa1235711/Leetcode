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
    public ListNode reverseKGroup(ListNode head, int k) {
       

 
       
        ListNode fina =new ListNode(0);
        
        ListNode fina2=fina;
        ListNode store =new ListNode(0);
        
        store=store.next;
        ListNode excess= head;
        
        ListNode store2=new ListNode(0);
        int count=0;
        while(head!=null)
        {
            count++;
        ListNode single =new ListNode(head.val);
        single.next=store;
        store=single;
        
        
        if(count%k==1)
        store2=store;
        if(count%k==0&&k!=1)
        {
            fina.next=store;
            fina=store2;
            
            
            store=null;
            excess=head.next;
        }
        head=head.next;
        }
        
        
        if(count%k!=0||k==1){
        head=excess;
        
        fina.next=head;}
        
        fina=fina2.next;
       return fina;

            



    
        
    }
}