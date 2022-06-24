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
    public ListNode middleNode(ListNode head) {
        //LinkedList list = new LinkedList();
        
        ListNode curr = head,temp=head;
        
        int size = 0;
        while(curr!=null)
        {
            size++;
            curr=curr.next;
        }
        int mid = size/2;
        int cnt=0;
        while(temp!=null)
        {
            cnt++;
            if(cnt == (mid+1))
            {
                head = temp;
                break;
            }
            temp = temp.next;
        }
       return head; 
    
    }
}