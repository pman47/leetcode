/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode(int x) { val = x; }
 * }
 */

class Solution {
    public final TreeNode getTargetCopy(final TreeNode original, final TreeNode cloned, final TreeNode target) {
        if (original == null || cloned == null) {
            return null;
        } else if (cloned.val == target.val) {
            return cloned;
        } else {
            TreeNode left = getTargetCopy(original.left, cloned.left, target); 
            if (left != null) {
                return left;
            } else {
                return getTargetCopy(original.right, cloned.right, target);
            }
        }
    }
}