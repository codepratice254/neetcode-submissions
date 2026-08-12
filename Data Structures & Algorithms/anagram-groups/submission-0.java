class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        List<List<String>> result = new ArrayList<>();
        Map<String,List<String>> mp = new HashMap();

        for(String str : strs){
            char [] ch = str.toCharArray();
            Arrays.sort(ch);
            String sorted = new String(ch);
            if(mp.containsKey(sorted)){
                mp.get(sorted).add(str);
            }else{
                List<String> toAdd = new ArrayList<>();
                toAdd.add(str);
                mp.put(sorted,toAdd);
            }
        }

        for(String key : mp.keySet()){
           result.add(mp.get(key)); 
        }



        return result;
    }
}
