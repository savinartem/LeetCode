class Solution {
public:
    vector<vector<int>> findDifference(vector<int>& nums1, vector<int>& nums2) {
        vector<vector<int>> result;
        vector<int> v1, v2;
        set<int> n1 (nums1.begin(), nums1.end()), n2(nums2.begin(), nums2.end());
        
        for(int i:n1)
        {
            if(n2.find(i)==n2.end())
            {
                v1.push_back(i);
            }
        }
        for(int i:n2)
        {
            if(n1.find(i)==n1.end())
            {
                v2.push_back(i);
            }
        }
        result.push_back(v1);
        result.push_back(v2);
        return result;
    }
};