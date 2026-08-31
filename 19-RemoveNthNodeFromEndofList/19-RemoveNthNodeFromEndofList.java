// Last updated: 8/31/2026, 4:34:33 PM
1/**
2 * Definition for singly-linked list.
3 * public class ListNode {
4 *     int val;
5 *     ListNode next;
6 *     ListNode() {}
7 *     ListNode(int val) { this.val = val; }
8 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
9 * }
10 */
11class Solution {
12    public ListNode removeNthFromEnd(ListNode head, int n) {
13        ListNode dummy = new ListNode(0);
14        dummy.next = head;
15        ListNode slow = dummy;
16        ListNode fast = dummy;
17
18        for (int i=0; i<=n; i++) {
19            fast = fast.next;
20        }
21
22        while (fast != null) {
23            slow = slow.next;
24            fast = fast.next;
25        }
26        slow.next = slow.next.next;
27        return dummy.next;
28    }
29}