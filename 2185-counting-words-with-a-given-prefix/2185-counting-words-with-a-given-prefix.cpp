class Solution {
public:
    int prefixCount(vector<string>& words, string pref) {
        int count=0;
        for(int i=0; i<words.size(); i++)
        {
            string s1=words[i].substr(0,pref.size());
            {
                if(s1==pref)
                {
                    count++;
                }
            }
        }
        return count;
    }
};