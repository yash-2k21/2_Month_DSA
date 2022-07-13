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
        ListNode prev = null;
		ListNode temp = head;
		ListNode curr = head;
		
		while(curr!=null && curr.next!=null)
		{
			
			if(curr.val == curr.next.val)
			{
				while(curr.next!=null && curr.val== curr.next.val){
					curr = curr.next;
				}
			    curr = curr.next;
				if(prev!=null){
					prev.next = curr;
				}
				else{
					head = curr;
				}
			}
			else{
				prev = curr;
				curr= curr.next;
			}
			
		}
		return head;
    }
}