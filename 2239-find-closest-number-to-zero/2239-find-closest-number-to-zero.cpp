class Solution {
public:
    int findClosestNumber(vector<int>& nums) {
        int maxVal=INT_MAX;
        int result;
        
        for(int i=0; i<nums.size();i++)
        {
            if(abs(nums[i])<maxVal)
            {
                maxVal=abs(nums[i]);
                result=nums[i];
            }
            else if(abs(nums[i])==maxVal)
            {
                result=max(result, nums[i]);
            }
        }
        return result;
    }
};
