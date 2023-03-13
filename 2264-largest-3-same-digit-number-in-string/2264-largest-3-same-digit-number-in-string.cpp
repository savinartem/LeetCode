class Solution {
public:
    string largestGoodInteger(string num) {
        char res=0;
        
        for(int i=2; i<num.size(); i++)
        {
            if(num[i]==num[i-1] && num[i]==num[i-2])
            {
                res=max(res, num[i]);
            }
        }
        if(res==0)
        {
            return "";
        }
        else
        {
            return string(3,res);    
        }
    }
};