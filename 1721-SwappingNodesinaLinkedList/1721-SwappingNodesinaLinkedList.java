// Last updated: 8/31/2026, 5:10:32 PM
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
12    public ListNode swapNodes(ListNode head, int k) {
13        ListNode first = head;
14        for (int i=1; i<k; i++) {
15            first = first.next;
16        }
17
18        ListNode second = head;
19        ListNode temp = first;
20
21        while (temp.next != null) {
22            temp = temp.next;
23            second = second.next;
24        }
25        int v = first.val;
26        first.val = second.val;
27        second.val = v;
28        return head;
29    }
30}