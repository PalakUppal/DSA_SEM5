// Last updated: 10/23/2026, 5:51:38 PM
1/**
2 * Definition for a binary tree node.
3 * public class TreeNode {
4 *     int val;
5 *     TreeNode left;
6 *     TreeNode right;
7 *     TreeNode() {}
8 *     TreeNode(int val) { this.val = val; }
9 *     TreeNode(int val, TreeNode left, TreeNode right) {
10 *         this.val = val;
11 *         this.left = left;
12 *         this.right = right;
13 *     }
14 * }
15 */
16class Solution {
17    public void inOrder(TreeNode root, List<Integer> ls) {
18        if (root == null) return;
19
20        inOrder(root.left, ls);
21        ls.add(root.val);
22        inOrder(root.right, ls);
23    }
24    public List<Integer> inorderTraversal(TreeNode root) {
25        List<Integer> ls = new ArrayList<>();
26        inOrder(root, ls);
27        return ls; 
28    }
29}