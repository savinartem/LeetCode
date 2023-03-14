class Solution {
public:
    int maximumDifference(vector<int>& nums) {
        int min=nums[0];
        int maxDiff=-1;
        
        for(int i=0; i<nums.size(); i++)
        {
            if(nums[i]<=min)
            {
                min=nums[i];
            }
            else
            {
                maxDiff=max(maxDiff, nums[i]-min);
            }
                
        }
        return maxDiff;
    }
};