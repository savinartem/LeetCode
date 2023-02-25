class Solution {
public:
    int countConsistentStrings(string allowed, vector<string>& words) {
        int result=0;
        unordered_set<char> s(allowed.begin(), allowed.end());
        
        for(int i=0; i<words.size();i++)
        {
            bool flag=false;
            for(int j=0; j<words[i].size();j++)
            {
                if(s.find(words[i][j])==s.end())
                {
                    flag=true;
                    break;
                }
            }
            if(!flag)
            {
                result++;
            }
        }
        
        return result;
    }
};