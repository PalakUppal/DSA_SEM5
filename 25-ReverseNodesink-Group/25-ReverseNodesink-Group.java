// Last updated: 11/20/2026, 6:22:10 PM
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
12    public ListNode reverseKGroup(ListNode head, int k) {
13        ListNode temp=head;
14        int count=0;
15        while(temp!=null && count<k){
16            temp=temp.next;
17            count++;
18        }
19        
20        if(count<k){
21            return head;}
22
23        ListNode curr=head;
24        ListNode prev=null;
25        count=0;
26        while(curr!=null && count<k){
27            ListNode next=curr.next;
28            curr.next=prev;
29            prev=curr;
30            curr=next;
31            count++;
32        }
33        if(curr!=null){
34            head.next=reverseKGroup(curr,k);
35        }
36        return prev;
37    }
38}