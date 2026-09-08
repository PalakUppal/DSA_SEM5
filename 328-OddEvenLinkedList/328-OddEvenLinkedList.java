// Last updated: 9/8/2026, 10:20:20 AM
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
12    public ListNode oddEvenList(ListNode head) {
13        if (head == null || head.next == null) return head;
14        ListNode oddDummy = new ListNode(0);
15        ListNode odd = oddDummy;
16
17        ListNode evenDummy = new ListNode(0);
18        ListNode even = evenDummy;
19
20        ListNode curr = head;
21        int i = 1;
22        while (curr != null) {
23            if (i%2==1) {
24                odd.next = curr;
25                odd = odd.next;
26            }
27            else {
28                even.next = curr;
29                even = even.next;
30            }
31            curr = curr.next;
32            i++;
33        }
34        odd.next = evenDummy.next;
35        even.next = null;
36        return oddDummy.next;
37    }
38}