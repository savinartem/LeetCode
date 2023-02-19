class Solution {
    public int countHillValley(int[] nums) {
        int hills=0;
        int valleys=0;
        
        for(int i=1; i<nums.length-1; i++)
        {
            int j=i+1;
            while(nums[j]==nums[i])
            {
                j++;
                if(j==nums.length){
            
                    return hills+valleys;
                }
            }
            if(nums[i]<nums[i-1] && nums[i]<nums[j])
            {
                valleys++;
            }
            if(nums[i]>nums[i-1] && nums[i]>nums[j])
            {
                hills++;
            }
            i=j-1;
        }
        return (hills+valleys);
    }
}