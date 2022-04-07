class Solution {
    public int missingNumber(int[] nums) {
        
        Arrays.sort(nums);
        int s=0;
        for(int i = 0 ;i < nums.length ; i++){
            s = i;
            if(i != nums[i])
                
                return i;
        }
        return s+1;
    }
}