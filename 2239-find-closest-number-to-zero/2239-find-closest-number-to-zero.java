class Solution {
    public int findClosestNumber(int[] nums) {
        int result=0;
        int min=Integer.MAX_VALUE;
        
        for(int i=0; i<nums.length; i++)
        {
            if(Math.abs(nums[i])<min)
            {
                min=Math.abs(nums[i]);
                result=nums[i];
            }
            else if(Math.abs(nums[i])==min)
            {
                result=Math.max(result, nums[i]);
            }
        }
        return result;
    }
}