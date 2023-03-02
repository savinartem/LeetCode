class Solution {
public:
    int countWords(vector<string>& words1, vector<string>& words2) {
        
        unordered_map<string, int> map1;
        unordered_map<string, int> map2;
        int count=0;
        
        for(int i=0; i<words1.size(); i++)
        {
            map1[words1[i]]++;
        }
        for(int i=0; i<words2.size(); i++)
        {
            map2[words2[i]]++;
        }
        for(auto i: words1)
        {
            if(map1[i]==1 && map2[i]==1)
            {
                count++;
            }
        }
        return count;
        
    }
};