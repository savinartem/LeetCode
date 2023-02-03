class Solution {
public:
    bool isPalindrome(string s) {
        for(int i=0; i<s.size();i++)
        {
            if(s[i]>='A' && s[i]<='Z')
            {
                char temp=s[i]+32;
                s[i]=temp;
            }
        }
        string result="";
        for(int i=0; i<s.size();i++)
        {
            if((s[i]>='a' &&s[i]<='z' || (s[i]>='0' && s[i]<='9')))
            {
                result.push_back(s[i]);
            }
        }
        
        int i=0, j=result.size()-1;
        while(i<j)
        {
            if(result[i]==result[j])
            {
                i++;
                j--;
            }
            else
            {
                return false;
            }
        }
        return true;
    }
};