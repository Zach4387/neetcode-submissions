class Solution {
    public int longestConsecutive(int[] nums) {
        SortedSet<Integer> set = new TreeSet<>();
        for (int n : nums) {
            set.add(n);
        }
        if(set.isEmpty()){
            return 0;
        }
        int maxLCS=1;
        int currentLCS=1;
        int lastNum = set.first();
        for(Integer n: set){
            if(n == lastNum +1){
                currentLCS++;
                if(currentLCS > maxLCS){
                    maxLCS = currentLCS;
                }
            } else{
                currentLCS=1;
            }
            lastNum=n;            

        }
        return maxLCS;
    }
}
