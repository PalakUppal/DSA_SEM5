// Last updated: 9/8/2026, 11:55:27 AM
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
12    public ListNode insertionSortList(ListNode head) {
13        if (head == null || head.next == null) return head;
14
15        ListNode dummy = new ListNode(0);
16        ListNode curr = head;
17
18        while (curr != null) {
19            ListNode next = curr.next;
20            ListNode currSorted = dummy.next;
21            ListNode prev = dummy;
22
23            while (currSorted != null && currSorted.val < curr.val) {
24                prev = currSorted;
25                currSorted = currSorted.next;
26            }
27            prev.next = curr;
28            curr.next = currSorted;
29            curr = next;
30        }
31        return dummy.next;
32    }
33}