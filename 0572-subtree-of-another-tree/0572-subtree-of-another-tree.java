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
    public boolean isSubtree(TreeNode r, TreeNode sr) {
        if(sr == null) return true;
        if(r == null) return false;

        if(sametree(r,sr)){
            return true;
        }

        return isSubtree(r.left, sr) || isSubtree(r.right, sr);
    }

    public boolean sametree(TreeNode r, TreeNode sr){
        if(r == null && sr == null) return true;
        if(r == null || sr == null) return false;
        if(r.val != sr.val) return false;

        return sametree(r.left,sr.left) && sametree(r.right,sr.right);
    }
}