class Solution {
    public int maxSubArray(int[] nums) {
        if(nums.length == 1){
            return nums[0];
        }
        
        int cm = 0;
        int max = nums[0];
        for(int  i : nums){
            
            if(cm < 0 )
                cm=0;
            
            cm += i;
            max = Math.max(cm,max);
        }
        return max;
        
        
    }
}