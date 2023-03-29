class Solution {
public:
    int maxAscendingSum(vector<int>& nums) {
        int maxSum=nums[0];
        int curr=nums[0];
        
        for(int i=1; i<nums.size();i++)
        {
            if(nums[i-1]<nums[i])
            {
                curr+=nums[i];
                
            }
        else
        {
            maxSum=max(maxSum, curr);
            curr=nums[i];
        }
        }
        return max(maxSum, curr);
    }
};