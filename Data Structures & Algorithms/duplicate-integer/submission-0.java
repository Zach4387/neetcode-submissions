class Solution {
    public boolean hasDuplicate(int[] nums) {
        HashSet hs = new HashSet();
        for (int i : nums) {
            if(hs.add(i))
            {
                continue;
            }
            else return true;
        }
        return false;
    }
}