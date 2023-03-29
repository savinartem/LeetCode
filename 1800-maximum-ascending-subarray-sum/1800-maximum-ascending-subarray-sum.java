class Solution {
    public int maxAscendingSum(int[] nums) {
        int maxSum=nums[0];
        int curr=nums[0];
        
        for(int i=1; i<nums.length; i++)
        {
            if(nums[i-1]<nums[i])
            {
                curr+=nums[i];
            }
            else
            {
                maxSum=Math.max(maxSum, curr);
                curr=nums[i];
            }
        }
        return Math.max(maxSum, curr);
    }
}