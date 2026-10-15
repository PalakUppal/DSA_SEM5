// Last updated: 10/15/2026, 6:22:36 PM
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
12    public ListNode mergeKLists(ListNode[] lists) {
13        PriorityQueue<ListNode> pq = new PriorityQueue<>(
14            (a,b)->Integer.compare(a.val,b.val)
15        );
16
17        for (ListNode node : lists) {
18            if (node != null) {
19                pq.offer(node);
20            }
21        }
22
23        ListNode dummy = new ListNode(0);
24        ListNode tail = dummy;
25        
26        while (!pq.isEmpty()) {
27            ListNode s = pq.poll();
28            tail.next = s;
29            tail = tail.next;
30            if (s.next != null) {
31                pq.offer(s.next);
32            }
33        }
34        return dummy.next;
35    }
36}