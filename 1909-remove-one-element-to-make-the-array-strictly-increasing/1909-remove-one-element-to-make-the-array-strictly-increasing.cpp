class Solution {
public:
    bool canBeIncreasing(vector<int>& nums) {
        int count=0;
        
        for(int i=0; i<nums.size()-1; i++)
        {
            if(nums[i]>=nums[i+1])
            {
                count++;
                if(count==2){ return false; }
                if(i>0 && nums[i-1]>=nums[i+1])
                {
                    nums[i+1]=nums[i];
                }
            }
        }
        return true;
    }
};