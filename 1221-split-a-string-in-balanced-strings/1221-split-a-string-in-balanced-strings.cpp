class Solution {
public:
    int balancedStringSplit(string s) {
         int r=0;
        int l=0;
        int result=0;
        
        for(int i=0; i<s.length(); i++)
        {
            if(s[i]=='R'){ r++; }
            else if(s[i]=='L'){ l++; }
            
            if(r==l) { result++; }
        }
        return result;
    }
};