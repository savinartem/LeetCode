class Solution {
public:
    int findGCD(vector<int>& nums) {
        int min=INT_MAX;
        int max=INT_MIN;
        
        for(int i=0; i<nums.size();i++)
        {
            if(nums[i]<=min)
            {
                min=nums[i];
            }
            if(nums[i]>=max)
            {
                max=nums[i];
            }
        }
        int div=max;
        
        while(div>0)
        {
            if(max%div==0 && min%div==0)
            {
                return div;
            }
            div--;
        }
        return 1;
    }
};