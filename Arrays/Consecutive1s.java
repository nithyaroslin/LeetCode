class Solution {
    public int findMaxConsecutiveOnes(int[] nums) {
        int tempLen = 0;
        int maxLen=0;
        for(int i=0; i<nums.length; i++){
            if (nums[i] == 1){
                tempLen +=1;
            }
            else {
                if (tempLen>maxLen){
                    maxLen= tempLen;
                    
                }
                tempLen = 0;
            }
            
        }
        if (tempLen>maxLen){
                    maxLen= tempLen;
                    
                }
        
        return maxLen;
    }
}