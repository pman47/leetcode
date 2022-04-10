// USING HASHMAPS
class Solution {
	public int[] findMode(TreeNode root) {
		HashMap<Integer,Integer> map = new HashMap<>();
		Traverse(root,map);
		Integer Max = 0;
		for(Map.Entry<Integer,Integer> entry:map.entrySet()){
			Max = Math.max(Max,entry.getValue());
		}

		ArrayList<Integer> list = new ArrayList<>();
		for(Map.Entry<Integer,Integer> entry:map.entrySet()){
			if(Max==entry.getValue()) list.add(entry.getKey());
		}
		return list.stream().mapToInt(Integer::intValue).toArray();
	}

	public void Traverse(TreeNode root,HashMap<Integer,Integer> map){
		if(root==null) return;
		map.put(root.val,map.getOrDefault(root.val,0)+1);
		Traverse(root.left,map);
		Traverse(root.right,map);
	}
}

// USING HEAPS
class Solution {
	public int[] findMode(TreeNode root) {
		HashMap<Integer,Integer> map = new HashMap<>();
		Traverse(root,map);
		PriorityQueue<Integer> pq = new PriorityQueue<>((n1, n2) -> {
			return (int) (map.get(n2)-map.get(n1));
		});

		ArrayList<Integer> list = new ArrayList<>();
		list.addAll(map.keySet());
		for(int i:list) {
			pq.add(i);
		}
		list.clear();

		Integer max = map.get(pq.peek());

		for(Map.Entry<Integer,Integer> entry:map.entrySet()){
			if(max==entry.getValue()) list.add(entry.getKey());
		}
		return list.stream().mapToInt(Integer::intValue).toArray();        
	}

	public void Traverse(TreeNode root,HashMap<Integer,Integer> map){
		if(root==null) return;
		map.put(root.val,map.getOrDefault(root.val,0)+1);
		Traverse(root.left,map);
		Traverse(root.right,map);
	}
}