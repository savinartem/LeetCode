class Solution {
public:
    string firstPalindrome(vector<string>& words) {
        string str="";
        bool flag=0;
        
        for(int k=0; k<words.size(); k++)
        {
            str=words[k];
            int i=0;
            int j=str.length()-1;
            
            while(i<=j)
            {
                if(str[i]==str[j])
                {
                    flag=1;
                    i++;
                    j--;
                }
                else
                {
                    flag=0;
                    break;
                }
            }
            if(flag)
            {
                return str;
            }
        }
        return "";
    }
};