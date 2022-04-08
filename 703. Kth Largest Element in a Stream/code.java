class KthLargest {
    final PriorityQueue <Integer> pq;
    final int size;

    public KthLargest(int k, int[] nums) {

        size = k;

        pq = new PriorityQueue <> (k);

        for(int element: nums)
            add(element);

    }

    public int add(int val) {

        pq.add(val);

        if(pq.size() > size)
            pq.poll();

        return pq.peek();
    }
}

/**
 * Your KthLargest object will be instantiated and called as such:
 * KthLargest obj = new KthLargest(k, nums);
 * int param_1 = obj.add(val);
 */