class Solution {
    public int lastStoneWeight(int[] stones) {
        if(stones.length == 0) return 0;
        if(stones.length == 1) return stones[0];


        PriorityQueue<Integer> pq = new PriorityQueue<>(Collections.reverseOrder());
        for(int stone: stones){
            pq.add(stone);
        }
        int stoneX= 0;
        int stoneY= 0;
        int stoneZ =0;
        while(pq.size()> 1){
            stoneX = pq.poll();
            stoneY = pq.poll();
            stoneZ = Math.abs(stoneX - stoneY);
            pq.add(stoneZ);
        }
        return pq.peek();
    }
}
