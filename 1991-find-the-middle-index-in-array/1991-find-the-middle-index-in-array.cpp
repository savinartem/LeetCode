class Solution {
public:
    int findMiddleIndex(vector<int>& nums) {
        int sum=0;
        int mid=0;
        
        for(int i=0; i<nums.size(); i++)
        {
            sum+=nums[i];
        }
        
        for(int i=0; i<nums.size();i++)
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
};