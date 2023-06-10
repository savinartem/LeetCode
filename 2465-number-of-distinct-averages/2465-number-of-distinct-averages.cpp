class Solution {
public:
    int distinctAverages(vector<int>& nums) {
         sort(nums.begin(), nums.end());
        int i=0;
        int j=nums.size()-1;
        set<int> s;
        while(i<j)
        {
            s.insert(nums[i]+nums[j]);
            i++;
            j--;
        }
        return s.size();
    }
};