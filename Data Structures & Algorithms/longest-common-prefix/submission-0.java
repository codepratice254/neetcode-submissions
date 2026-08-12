class Solution {
    public String longestCommonPrefix(String[] strs) {
        String result = strs[0];
        for(int i=1;i<strs.length;i++){
            result = commonPrefix(result,strs[i]);
        }
        return result;
    }
    public String commonPrefix(String str1, String str2){
        String result = "";
        int maxLen = (str1.length()<str2.length())?str1.length():str2.length();
        for(int i=0;i<maxLen;i++){
            if(str1.charAt(i) == str2.charAt(i)){
                result+= str1.charAt(i);
            }else {
                return result;
            } 
        }
        return result;
    }
}