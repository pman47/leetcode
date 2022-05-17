class Solution {
	TreeNode tmp = null;
	public final TreeNode getTargetCopy(final TreeNode original, final TreeNode cloned, final TreeNode target) {
		preorder(original,cloned,target);
		return tmp;
	}

	void preorder(final TreeNode original, final TreeNode cloned, final TreeNode target){
		if (original == null || cloned == null || tmp!=null) return;
		if (cloned.val == target.val){
			tmp = cloned;
			return;
		}
		preorder(original.left,cloned.left,target);
		preorder(original.right,cloned.right,target);
	}
}

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