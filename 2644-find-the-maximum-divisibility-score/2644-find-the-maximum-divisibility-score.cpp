class Solution {
public:
    int maxDivScore(vector<int>& nums, vector<int>& divisors) {
        sort(divisors.begin(), divisors.end());
        int max=0;
        int res=divisors[0];
        for(int i=0; i<divisors.size(); i++)
        {
            int count=0;
            for(int j=0; j<nums.size();j++)
            {
                if(nums[j]%divisors[i]==0)
                {
                    count++;
                }
            }
           
            if(count>max)
            {
                max=count;
                res=divisors[i];
            }
        }
        return res;
    }
};