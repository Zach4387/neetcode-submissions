class Solution {
    public boolean isAnagram(String s, String t) {
        int[] counts = new int [26];
        
        if (s.length() != t.length()) {
            return false;
        }
        s = s.toLowerCase();
        t = t.toLowerCase();
        for ( int i =0; i < s.length(); i++) {
            char cs = s.charAt(i);
            char ct = t.charAt(i);
            counts[cs -'a']++;
            counts[ct-'a']--;
        }

        for(int i=0; i< counts.length; i++){
            if (counts[i] != 0)
                return false;        
        }
        return true;
    }
}
