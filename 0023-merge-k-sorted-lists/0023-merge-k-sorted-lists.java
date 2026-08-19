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
    public ListNode mergeKLists(ListNode[] lists) {
      ArrayList<Integer> arr= new ArrayList<>();

        
        ListNode dummy = new ListNode(0);
        ListNode curr = dummy;
        for (int i=0;i<lists.length;i++)
        {
          curr.next=lists[i];
          while(curr.next!=null){
             curr=curr.next;
             arr.add(curr.val);
          }
        }
        curr=dummy.next;
        Collections.sort(arr);
    for (int j =0;j<arr.size();j++)
    { 
        curr.val=arr.get(j);
        curr=curr.next;
       
    }
    curr =dummy.next;
    return curr;
} 
}
   
    