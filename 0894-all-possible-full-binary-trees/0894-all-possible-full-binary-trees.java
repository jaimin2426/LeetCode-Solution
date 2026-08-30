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
    Map<Integer, List<TreeNode>> memo = new HashMap<>();

    public List<TreeNode> allPossibleFBT(int n) {
        if (n % 2 == 0)
            return new ArrayList<>();

        if (memo.containsKey(n)) {
            return memo.get(n);
        }

        List<TreeNode> l = new ArrayList<>();

        if (n == 1) {
            l.add(new TreeNode(0));
            memo.put(n, l);
            return l;
        }

        for (int i = 1; i < n; i += 2) {
            int j = n - 1 - i;

            List<TreeNode> le = allPossibleFBT(i);
            List<TreeNode> r = allPossibleFBT(j);

            for (TreeNode left : le) {
                for (TreeNode right : r) {
                    TreeNode root = new TreeNode(0);

                    root.left = left;
                    root.right = right;

                    l.add(root);
                }
            }
        }

        memo.put(n, l);

        return l;
    }
}