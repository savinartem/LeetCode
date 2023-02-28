class Solution {
public:
    vector<int> leftRigthDifference(vector<int>& nums) {
        int totalSum=0;
        int leftSum=0;
        vector<int>answer(nums.size());
        
        for(int i=0; i<nums.size();i++)
        {
            totalSum+=nums[i];
        }
        
        for(int i=0; i<nums.size(); i++)
        {
            int rightSum=totalSum-leftSum-nums[i];
            answer[i]=abs(leftSum-rightSum);
            leftSum+=nums[i];
        }
        
        return answer;
    }
};