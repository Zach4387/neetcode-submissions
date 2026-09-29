class Solution {
    public int[] dailyTemperatures(int[] temperatures) {

        int res[] = new int[temperatures.length];
        Stack<int[]> stack = new Stack<>();
        int  pair[] = new int[2];
        for(int i =0; i < temperatures.length; i++){
            int ctemp = temperatures[i];
            //check value on top of stack, if current temp is higher then pop and update result;
            while(!stack.isEmpty() && ctemp > stack.peek()[0]){
                pair = stack.pop();
                res[pair[1]] = i - pair[1]; // current index - index of popped temp;
            }
            stack.push(new int[] {ctemp, i});
        }



        return res;
        
    }
}
