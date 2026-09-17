class Solution {
    public int majorityElement(int[] nums) {
        Map<Integer,Integer> mp = new HashMap<>();
        int n = nums.length;
        for(int num: nums){
            mp.put(num,mp.getOrDefault(num,0)+1);
        }

        for(int key : mp.keySet()){
            if(mp.get(key) > (n/2) ){
                return key;
            }
        }

        return -1;
    }
}