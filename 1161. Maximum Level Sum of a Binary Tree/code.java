// Method 1 - Using Simple Level Order Traversal
class Solution {
	public int maxLevelSum(TreeNode root) {
		if(root==null) return 0;
		Queue<TreeNode> q = new LinkedList<>();
		q.add(root);
		q.add(null);
		long max = 0;
		int depth = 1;
		long maxTillNow = root.val;
		int ans = 1;
		while(!q.isEmpty()){
			TreeNode tmp = q.poll();

			if(tmp==null){
				if(!q.isEmpty()){
					q.add(null);
				}
				if(max > maxTillNow){
					ans = depth;
					maxTillNow = max;
				}
				depth++;
				max = 0;
				continue;
			}
			max += tmp.val;

			if(tmp.left!=null) q.add(tmp.left);
			if(tmp.right!=null) q.add(tmp.right);
		}
		return ans;
	}
}

// Method 2 - Level Order Traversal With PriorityQueue
class Pair implements Comparable<Pair>{
	int depth;
	long total;
	Pair(int x,long y){
		depth = x;
		total = y;
	}
	public int compareTo(Pair b){
		if(this.total > b.total) return -1;
		return 0;
	}
}

class Solution {
	public int maxLevelSum(TreeNode root) {
		if(root==null) return 0;
		Queue<TreeNode> q = new LinkedList<>();
		PriorityQueue<Pair> pq = new PriorityQueue<Pair>();
		q.add(root);
		q.add(null);
		int depth = 1;
		long max = 0;
		while(!q.isEmpty()){
			TreeNode tmp = q.poll();

			if(tmp==null){
				if(!q.isEmpty()){
					q.add(null);
				}
				pq.add(new Pair(depth,max));
				depth++;
				max = 0;
				continue;
			}
			max += tmp.val;

			if(tmp.left!=null) q.add(tmp.left);
			if(tmp.right!=null) q.add(tmp.right);
		}
		return pq.peek().depth;
	}
}