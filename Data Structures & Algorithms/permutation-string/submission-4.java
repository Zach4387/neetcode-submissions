class Solution {
    public boolean checkInclusion(String s1, String s2) {
        int[] freqs1 = new int[26];
        int[] freqs2 = new int[26];

        if (s1.length() > s2.length()) return false;
        if (s1.length()== 0 || s2.length()==0) return false;
        for(char c:  s1.toCharArray()){
            freqs1[c -'a']++;
        }
        System.out.println(freqs1);
        int left = 0;
        int right = 0;
        while(right< s1.length())
        {
            freqs2[s2.charAt(right) -'a']++;        
            right++;
        }        
        if(Arrays.equals(freqs1, freqs2)) return true;
        right--;
        System.out.println(right);
        while(right < s2.length()-1){            
            freqs2[s2.charAt(left)-'a']--;
            left++;
            right++;
            freqs2[s2.charAt(right)-'a']++;
            System.out.println(s2.substring(left,right));
            if(Arrays.equals(freqs1, freqs2)) return true;

                

        }

        return false;

    }

   
}
