class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {        
        HashMap<String, List<String>> map = new HashMap<>(); 
        for (String str: strs){
            int[] charCount = new int[26];
            for(Character c: str.toCharArray()){
                charCount[c-'a']++;
            }
            String key = Arrays.toString(charCount);
            if(map.containsKey(key)){
             map.get(key).add(str);
            }
            else {
                ArrayList newList = new ArrayList<>();
                newList.add(str);
                map.put(key, newList);
            }

        }
        return new ArrayList<>(map.values());
        
    }
}
