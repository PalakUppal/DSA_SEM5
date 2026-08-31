// Last updated: 8/31/2026, 5:43:37 PM
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
12    
13    public ListNode rotateRight(ListNode head, int k) {
14        if (head == null || head.next == null || k==0) {
15            return head;
16        }
17
18        ListNode tail = head;
19        int len = 1;
20        while (tail.next != null) {
21            tail = tail.next;
22            len++;
23        }
24
25        k = k%len;
26        if (k==0) return head;
27
28        tail.next = head;
29        int newTail = len-k;
30        ListNode nT = head;
31        for (int i=1; i<newTail; i++) {
32            nT = nT.next;
33        }
34
35        ListNode newHead = nT.next;
36        nT.next = null;
37        return newHead;
38    }
39}