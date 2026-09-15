class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        ArrayList<List<String>> anagramList = new ArrayList<>();
        for(String str: strs){
            boolean foundMatch = false;
            for(List<String> list : anagramList){
                if (isAnagram(str, list.getFirst())){
                    list.add(str);
                    foundMatch = true;
                    break;
                }
            }
            if (!foundMatch){
                ArrayList<String> newList = new ArrayList<>();
                newList.add(str);
                anagramList.add(newList);
            }
        }
        return anagramList;
    }

    public boolean isAnagram(String s1, String s2 ){
        int[] arr= new int[26];
        if (s1.length()!= s2.length()){
            return false;
        }
        
        for (int i=0; i < s1.length(); i++){
            arr[s1.charAt(i) -'a']++;
            arr[s2.charAt(i) -'a']--;
        }

        for (int i=0; i < 26; i++){
            if(arr[i]>0){
                return false;
            }
        }

        return true;

    }
}
