class Solution {
    public int lengthOfLongestSubstring(String s) {
        if(s.length() < 2) return s.length();
        HashSet<Character> unqc = new HashSet<Character>();
        int left=0;
        int right =1;
        StringBuilder sb = new StringBuilder();        

        sb.append(s.charAt(0));
        String lcs = sb.toString();
        unqc.add(s.charAt(0));
        //aab bcda
        while(right < s.length()){
            char cr = s.charAt(right); 
            if (!unqc.contains(cr)){ 
                unqc.add(cr);
                sb.append(cr);
                if(lcs.length() < sb.length()){
                    //System.out.println(s.substring(left,right));
                    lcs = sb.toString();
                    System.out.println(lcs);
                }                
                right++;
            }else{
                unqc.remove(s.charAt(left));
                sb.deleteCharAt(0);
                left++;
                
            }                

        }
        return lcs.length();

    }
}
