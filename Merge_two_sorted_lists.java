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
    public ListNode mergeTwoLists(ListNode list1, ListNode list2) {
        ListNode l = new ListNode();
        return merge_helper(l, list1, list2);
    }
    ListNode merge_helper(ListNode l, ListNode list1, ListNode list2)
    {
        if(list1==null) 
        {
            l = list2;
            return l;
        }
        else if (list2==null) 
        {
            l = list1;
            return l;
        }
        else
        {
            if(list1.val<list2.val) 
            {
                l = new ListNode(list1.val);
                l.next = merge_helper(l.next, list1.next, list2);
            }
            else if(list1.val>list2.val)
            {
                l = new ListNode(list2.val);
                l.next = merge_helper(l.next, list2.next, list1);
            }
            else
            {
                l = new ListNode(list1.val, list2);
                l.next.next = merge_helper(l.next.next, list1.next, list2.next);
            }
            return l;
        }
    }
}