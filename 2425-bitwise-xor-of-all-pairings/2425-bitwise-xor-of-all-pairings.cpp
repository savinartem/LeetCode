class Solution {
public:
    int xorAllNums(vector<int>& nums1, vector<int>& nums2) {
        int a=0;
        int b=0;
        
        for(int i=0; i<nums1.size(); i++)
        {
            a^= nums1[i];
        }
        for(int j=0; j<nums2.size();j++)
        {
            b^=nums2[j];
        }
        
        return (nums1.size() % 2 *b) ^ (nums2.size() % 2*a);
    }
};