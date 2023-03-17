class Solution {
public:
    string makeFancyString(string s) {
        
        int count=1;
        string result="";
        result.push_back(s[0]);
        
        for(int i=1; i<s.length(); i++)
        {
            if(s[i]==s[i-1])
            {
                count++;
            }
            else
            {
                count=1;
            }
            if(count<3)
            {
                result.push_back(s[i]);
            }
        }
        return result;
    }
};