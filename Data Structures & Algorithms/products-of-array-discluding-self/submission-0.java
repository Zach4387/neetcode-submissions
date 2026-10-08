class Solution {
    public int[] productExceptSelf(int[] nums) {
        
        int total=1;
        int zeroCount =0;
        
        for(int i =0; i< nums.length; i++){
            if(nums[i] ==0) {
                zeroCount++;
            }
            else{ 
                total= total * nums[i];
            }
        }
        
        int[] result = new int[nums.length];
        if (zeroCount>1) return result;
        
        
        for(int i =0; i< nums.length; i++){
            if(zeroCount> 0)
            { result[i] = (nums[i]==0) ? total : 0;}            
            else{ 
                result[i] = total/ nums[i];
            }
        }

        return result;

    }
}  
