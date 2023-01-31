class Solution {
public:
    int lengthOfLastWord(string s) {
        int len=0;
        int i=s.size()-1;
        
        while(i>=0 && s[i]==' ')
        {
            i-=1;
        }
        while(i>=0 && s[i]!=' ')
        {
            len+=1;
            i-=1;
        }
        return len;
    }
};