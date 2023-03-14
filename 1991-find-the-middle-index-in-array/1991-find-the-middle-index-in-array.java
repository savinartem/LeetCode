class Solution {
    public int findMiddleIndex(int[] nums) {
        int sum=0;
        int mid=0;
        
        for(int i=0; i<nums.length; i++)
        {
            sum+=nums[i];
        }
        
        for(int i=0; i<nums.length;i++)
        {
            sum-=nums[i];
            
            if(sum==mid)
            {
                return i;
            }
            mid+=nums[i];
        }
        return -1;
    }
}