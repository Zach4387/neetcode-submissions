class Solution {
    public int search(int[] nums, int target) {

        return search(nums, target, 0, nums.length-1);
        
    }

    public int search(int[] nums, int target, int low, int high) {
        if(high >= low)
        {
            int mid =low + (high -low)/2;

            if(nums[mid]== target){
                return mid;
            } 
            if(high - low <= 0) return -1;
            
            if(nums[mid] > target ){ //search left
                    return search(nums, target, low, mid-1);
            } else if(nums[mid] < target) { // target is higher so search right
                return search(nums, target, mid+1, high);
            }
        } 
         return -1;
    }
}
