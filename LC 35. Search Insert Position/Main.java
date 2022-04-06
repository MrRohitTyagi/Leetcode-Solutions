class Solution {
    public int searchInsert(int[] nums, int target) {
        
        int NF = 0;
        int ans = 0;
        
        for(int i = 0 ;i <nums.length ; i++ ){
            if(target > nums[i]){
                NF++;
            }
            if(nums[i] == target){
                    ans = i;
            }
        }
        return ans != 0 ? ans :NF;
        
    }
}