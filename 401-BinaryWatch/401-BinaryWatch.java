// Last updated: 9/3/2026, 5:35:29 PM
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
12    public void reorderList(ListNode head) {
13        if (head == null || head.next == null) return;
14        ListNode slow = head;
15        ListNode fast = head;
16
17        while (fast != null && fast.next != null) {
18            slow = slow.next;
19            fast = fast.next.next;
20        }
21
22
23        ListNode second = slow.next;
24        slow.next = null;
25
26        ListNode prev = null;
27        while (second!=null) {
28            ListNode nextNode = second.next;
29            second.next = prev;
30            prev = second;
31            second = nextNode;
32        }
33
34        second = prev; //5
35
36        ListNode first = head;
37        while (second !=null) {
38            ListNode firstNext = first.next;
39            ListNode secondNext = second.next;
40            first.next = second;
41            second.next = firstNext;
42            first = firstNext;
43            second = secondNext;
44        }
45    }
46}