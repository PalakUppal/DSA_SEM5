// Last updated: 10/23/2026, 5:53:53 PM
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
17    public void postOrder(TreeNode root, List<Integer> ds) {
18        if (root == null) return;
19
20        postOrder(root.left, ds);
21        postOrder(root.right, ds);
22        ds.add(root.val);
23    }
24    public List<Integer> postorderTraversal(TreeNode root) {
25        List<Integer> ds = new ArrayList<>();
26        postOrder(root, ds);
27        return ds;
28    }
29}