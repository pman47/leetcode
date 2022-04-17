// METHOD - 1 , 2ms Solution
class Solution {
	public List<Integer> largestValues(TreeNode root) {
		if(root==null) return new ArrayList<Integer>();
		List<Integer> list = new ArrayList<>();
		Queue<TreeNode> q = new LinkedList<>();
		q.add(root);
		q.add(null);
		int max = Integer.MIN_VALUE;
		while(!q.isEmpty()){
			TreeNode tmp = q.poll();

			if(tmp==null){
				if(!q.isEmpty()){
					q.add(null);
				}
				list.add(max);
				max = Integer.MIN_VALUE;
				continue;
			}
			max = Math.max(max,tmp.val);

			if(tmp.left!=null) q.add(tmp.left);
			if(tmp.right!=null) q.add(tmp.right);
		}
		return list;
	}
}


// METHOD - 2 , 4ms Solution
class Solution {
	public List<Integer> largestValues(TreeNode root) {
		if(root==null) return new ArrayList<Integer>();
		List<Integer> list = new ArrayList<>();
		Queue<TreeNode> q = new LinkedList<>();
		PriorityQueue<Integer> pq = new PriorityQueue<>(Collections.reverseOrder());
		q.add(root);
		q.add(null);
		while(!q.isEmpty()){
			TreeNode tmp = q.poll();

			if(tmp==null){
				if(!q.isEmpty()){
					q.add(null);
				}
				list.add(pq.peek());
				pq.clear();
				continue;
			}
			pq.add(tmp.val);

			if(tmp.left!=null) q.add(tmp.left);
			if(tmp.right!=null) q.add(tmp.right);
		}
		return list;
	}
}