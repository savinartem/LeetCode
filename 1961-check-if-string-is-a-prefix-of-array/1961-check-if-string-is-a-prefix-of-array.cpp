class Solution {
public:
    bool isPrefixString(string s, vector<string>& words) {
        string newStr="";
        
        for(string str:words)
        {
            for(char ch: str)
            {
                newStr+=ch;
            }
            if(newStr==s)
            {
                return true;
            }
        }
        return false;
    }
};