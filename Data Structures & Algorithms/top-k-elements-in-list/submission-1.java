class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        Map<Integer, Integer> counts = new HashMap<>();
        int maxFreq =0;
        for(int i : nums){
            if(counts.containsKey(i)){
                int frequency = counts.get(i) +1;
                counts.put(i, frequency);
                if (frequency > maxFreq)
                    maxFreq=frequency;
            }
            else {
                counts.put(i,1);
                if(maxFreq==0) {
                    maxFreq=1;
                }
                
            }
            
        }

        //create n buckets where n=maxFreq
        List<Integer>[] buckets = new ArrayList[maxFreq+1];
        for(int i = 0; i <= maxFreq; i++){
            buckets[i] = new ArrayList<>();
        }

        //put elements in different buckets
        for (int countElem : counts.keySet()){
            buckets[counts.get(countElem)].add(countElem);
        }
        //for(int i=0; i < counts.size(); i++){
          //  buckets[counts.get(i)].add(i);
        //}

        int[] answer = new int[k];
        int idx=0;
        for(int b=maxFreq; b>=0 && idx < k; b-- ){
            for(int num: buckets[b]){
                answer[idx++] = num;
                if(idx==k){
                    return answer;
                }
            }
        }
        // while(k>0){
            
        //     List<Integer> bucket = buckets[maxFreq-i];
            
        //     if(bucket.size()==1){
        //         answer[i]=bucket.get(0);
        //         k--;
        //         i++;
        //     }
        //     if(bucket.size()>1){
        //         if(bucket.size()<= k){
        //             for(int n : bucket){
        //                 answer[i]= n;
        //                 i++;
        //                 k--;
        //             }
        //         }
        //         else if (bucket.size()> k){
        //             int j=0;
        //              while(k>0){
                        
        //                 answer[i] =bucket.get(j);
        //                 j++;
        //                 i++;
        //                 k--;
        //             }                    
        //         }                
        //     }
    
        // }
        return answer;

    }
}
