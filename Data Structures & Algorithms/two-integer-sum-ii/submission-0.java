class Solution {
    public int[] twoSum(int[] numbers, int target) {
        
        int i1 = 0;
        int i2 = numbers.length-1;
        int sum =0;
        while (i1 < i2){
            sum = numbers[i1] + numbers[i2];
            if (sum== target){
                return new int[] {i1+1,i2+1};                
            }
            else if(sum > target){
                i2--;
            }
            else if(sum < target){
                i1++;
            }
        }
        return new int[] {i1+1,i2+1};
    }
}
