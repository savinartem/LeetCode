class Solution {
public:
    vector<string> removeAnagrams(vector<string>& words) {
        vector<string> result;
        
        string cur=words[0];
        result.push_back(cur);
        sort(cur.begin(), cur.end());
        
        for(int i=1; i<words.size(); i++)
        {
            string next=words[i];
            sort(next.begin(), next.end());
            if(cur==next)
            {
                continue;
            }
            else
            {
                result.push_back(words[i]);
                cur=next;
            }
        }
        return result;
    }
};