class Solution {
public:
    vector<int> twoOutOfThree(vector<int>& nums1, vector<int>& nums2, vector<int>& nums3) {
        unordered_map<int, set<int>> mp;
        vector<int> result;
        
        for(int i: nums1)
        {
            mp[i].insert(0);
        }
        for(int i: nums2)
        {
            mp[i].insert(1);
        }
        for(int i: nums3)
        {
            mp[i].insert(2);
        }
        
        for(auto it: mp)
        {
            if(it.second.size()>=2)
            {
                result.push_back(it.first);
            }
        }
        return result;
    }
};