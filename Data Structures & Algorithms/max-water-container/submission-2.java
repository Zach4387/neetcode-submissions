class Solution {
    public int maxArea(int[] heights) {
        if(heights.length < 2) {
            return 0;
        }
        int max_area = 0;
        int area = 0;
        int width = 0;
        int i1 = 0;
        int i2 = heights.length-1;

        while (i1< i2) {
            width = i2 -i1;
            area = Math.min(heights[i1], heights[i2]) * width;
            if (area > max_area){
                max_area=area;
            }
            if(heights[i1] <= heights[i2]) i1++;
            else i2--;
        }    
        return max_area;
    }
}
