// Last updated: 10/23/2026, 5:41:17 PM
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
17
18    static void preOrder(TreeNode root, List<Integer> ds) {
19        if (root == null) {
20            return;
21        }
22        ds.add(root.val);
23        preOrder(root.left, ds);
24        preOrder(root.right, ds);
25    }
26
27    public List<Integer> preorderTraversal(TreeNode root) {
28        List<Integer> ds = new ArrayList<>();
29        preOrder(root, ds);
30        return ds;
31    }
32}