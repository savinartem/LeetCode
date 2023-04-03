class Solution {
public:
    int findTheLongestBalancedSubstring(string s) {
        int result=0;
        int zeros=0;
        int ones=0;
        int temp=0;
        
        for(int i=0; i<s.length();i++)
        {
            if(s[i]=='0'){ zeros++; }
        
        else
        {
            ones++;
        }
        temp++;
        result=max(result, 2*min(ones, zeros));
        if(i+1<s.length() && s[i]=='1' && s[i+1]=='0')
        {
            zeros=ones=temp=0;
        }
        }
        return result;
    }
};