class KthLargest {
    PriorityQueue<Integer> kQueue = null;
    int kth = 0;
    public KthLargest(int k, int[] nums) {
        kQueue = new PriorityQueue<>();
        kth = k;
        for(int num : nums){
            kQueue.add(num);
        }

        while(!kQueue.isEmpty()&& kQueue.size() > k ){
            kQueue.poll();
        }
    }
    
    public int add(int val) {
        kQueue.add(val);

        while(!kQueue.isEmpty()&& kQueue.size() > kth ){
            kQueue.poll();
        }
        
        return kQueue.peek();
        
    }
}
