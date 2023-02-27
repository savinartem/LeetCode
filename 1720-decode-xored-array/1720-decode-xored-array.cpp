class Solution {
public:
    vector<int> decode(vector<int>& encoded, int first) {
     vector<int> result;
        result.push_back(first);
        
        for(int i=0; i<encoded.size();i++)
        {
            int temp=result[i]^encoded[i];
            result.push_back(temp);
        }
        return result;
    }
};