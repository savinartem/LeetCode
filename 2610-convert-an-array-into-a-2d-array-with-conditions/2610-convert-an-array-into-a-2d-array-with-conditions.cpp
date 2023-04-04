class Solution {
public:
    vector<vector<int>> findMatrix(vector<int>& nums) {
       int n=nums.size();
        
        vector<int> count(n+10);
        vector<vector<int>> result;
        
    for(int i=0; i<n;i++)
    {
        if(result.size()<=count[nums[i]])
        {
            result.push_back({});
            
        }
        result[count[nums[i]]++].push_back(nums[i]);
    }
        return result;
    }
};