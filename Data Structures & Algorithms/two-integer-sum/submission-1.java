class Solution {
    public int[] twoSum(int[] nums, int target) {
        HashMap<Integer, Integer> map = new HashMap();        
        int [] answer = new int[2];
        int i = 0;
        for(int n: nums){
            
            map.putIfAbsent(n,i);
            if (map.containsKey(target-n))
            {
                int k = map.get(target-n);
                if (i!=k){
                    answer = new int[]{k,i};
                    return answer;
                }                
            }
            i++;
        }
        return answer;
    }
}
