/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode() {}
 *     TreeNode(int val) { this.val = val; }
 *     TreeNode(int val, TreeNode left, TreeNode right) {
 *         this.val = val;
 *         this.left = left;
 *         this.right = right;
 *     }
 * }
 */
class Solution {
    int count = 0;
    int maxCount = 0;
    Integer prev = null;
    ArrayList<Integer> list = new ArrayList<>();

    public int[] findMode(TreeNode root) {
        inorder(root);

        int ans[] = new int[list.size()];
        int i = 0;
        for (int j : list) {
            ans[i++] = j;
        }
        return ans;
    }

    public void inorder(TreeNode root) {
        if (root == null)
            return;
        inorder(root.left);

        if (prev != null && root.val == prev) {
            count++;
        } else {
            count = 1;
        }

        if (count > maxCount) {
            list.clear();
            list.add(root.val);
            maxCount = count;
        } else if (count == maxCount) {
            list.add(root.val);
        }

        prev = root.val;

        inorder(root.right);
    }
}