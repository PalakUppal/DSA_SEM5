// Last updated: 11/20/2026, 5:41:36 PM
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
17    public TreeNode build(int[] preorder, int preS, int preE, int[] inorder, int inS, int inE, Map<Integer, Integer> mp) {
18        if (preS > preE || inS > inE) return null;
19
20        TreeNode root = new TreeNode(preorder[preS]);
21        int inRoot = mp.get(root.val);
22        int numsLeft = inRoot - inS;
23
24        root.left = build(preorder, preS+1, preS+numsLeft, inorder, inS, inRoot-1, mp);
25        root.right = build(preorder, preS+numsLeft+1, preE, inorder, inRoot+1, inE, mp);
26        return root;
27    }
28
29    public TreeNode buildTree(int[] preorder, int[] inorder) {
30        HashMap<Integer, Integer> mp = new HashMap<>();
31
32        for (int i=0; i<inorder.length; i++) {
33            mp.put(inorder[i], i);
34        }
35
36        return build(preorder, 0, preorder.length-1, inorder, 0, inorder.length-1, mp);
37
38    }
39}