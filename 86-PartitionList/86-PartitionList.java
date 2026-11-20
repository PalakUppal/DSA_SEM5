// Last updated: 11/20/2026, 6:29:40 PM
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
12    public ListNode partition(ListNode head, int x) {
13        ListNode smallDummy = new ListNode(0);
14        ListNode bigDummy = new ListNode(0);
15
16        ListNode small = smallDummy;
17        ListNode big = bigDummy;
18        ListNode curr = head;
19        while (curr != null) {
20            if (curr.val < x) {
21                small.next = curr;
22                small = small.next;
23            }
24            else {
25                big.next = curr;
26                big = big.next;
27            }
28            curr = curr.next;
29        }
30        big.next = null;
31        small.next = bigDummy.next;
32        return smallDummy.next;
33    }
34}