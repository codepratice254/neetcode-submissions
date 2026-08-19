class Solution {
    public void sortColors(int[] nums) {
        int countZero =0;
        int countOnes =0;
        int countTwos =0;
        for(int num : nums){
            if(num == 0){
                countZero++;
            }else if( num ==1){
                countOnes++;
            }else {
                countTwos++;
            }
        }
        int k=0;
        while(countZero > 0){
            nums[k++] =0;
            countZero--;
        }
        while(countOnes > 0){
            nums[k++] =1;
            countOnes--;
        }
        while(countTwos > 0){
            nums[k++] =2;
            countTwos--;
        }
    }
}