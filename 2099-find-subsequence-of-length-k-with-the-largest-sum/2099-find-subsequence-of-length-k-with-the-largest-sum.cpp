class Solution {
public:
    vector<int> maxSubsequence(vector<int>& nums, int k) {
        
        vector<pair<int,int>> vect;
        int n=nums.size();
        for(int i=0; i<n;i++)
        {
            vect.push_back({nums[i],i});
        }
        sort(vect.begin(), vect.end());
        long long int sum=0;
        vector <pair<int, int>> vect2;
        for(int i=n-1;i>=n-k;i--)
        {
            vect2.push_back({vect[i].second, vect[i].first});
        }
        sort(vect2.begin(), vect2.end());
        vector<int>vect3;
        for(int i=0; i<vect2.size();i++)
        {
            vect3.push_back(vect2[i].second);
        }
        return vect3;
    }
};