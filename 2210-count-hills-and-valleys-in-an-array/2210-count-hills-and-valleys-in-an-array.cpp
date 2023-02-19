class Solution {
public:
    int countHillValley(vector<int>& nums) {
        int hills=0;
        int valleys=0;
        
        for(int i=1; i<nums.size()-1; i++)
        {
            int j=i+1;
            while(nums[j]==nums[i])
            {
                j++;
                if(j==nums.size())
                {
                    return (hills+valleys);
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
};