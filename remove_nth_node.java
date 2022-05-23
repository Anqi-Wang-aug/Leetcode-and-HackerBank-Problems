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
        ListNode l = new ListNode();
        ArrayList<Integer> tmp = new ArrayList<Integer>();
        while(head!=null)
        {
            tmp.add(head.val);
            head = head.next;
        }
        tmp.remove(tmp.size()-n);
        l = addNode(l.next,0,tmp);
        return l;
    }
    ListNode addNode(ListNode l, int i, ArrayList<Integer>tmp)
    {
        if(i>=tmp.size()) return null;
        l = new ListNode(tmp.get(i));
        l.next = addNode(l.next, ++i, tmp);
        return l;
    }
}