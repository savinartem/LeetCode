class Solution {
public:
    int minPairSum(vector<int>& nums) {
       int result=0;
        int n=nums.size();
        sort(nums.begin(), nums.end());
        for(int i=0; i<n/2;i++)
        {
            int pair=nums[i]+nums[n-1-i];
            result=max(result, pair);
        }
        return result;
    }
};