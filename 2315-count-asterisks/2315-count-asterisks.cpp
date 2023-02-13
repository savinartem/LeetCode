class Solution {
public:
    int countAsterisks(string s) {
        int result=0;
        bool flag=false;
        
        for(int i=0; i<s.size(); i++)
        {
            if(s[i]=='|' && flag==false)
            {
                flag=true;
            }
            else if(s[i]=='|' && flag==true)
            {
                flag=false;
            }
            if(s[i]=='*' && flag==false)
            {
                result++;
            }
        }
        return result;
    }
};