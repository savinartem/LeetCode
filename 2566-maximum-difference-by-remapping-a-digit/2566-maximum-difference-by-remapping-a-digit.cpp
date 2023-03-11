class Solution {
public:
    int minMaxDifference(int num) {
     string num1=to_string(num);
        string num2=to_string(num);
        
        char c1=num1[0];
        char c2=num2[0];
        
        for(int i=0; i<num1.size(); i++)
        {
            if(num1[i]!='9')
            {
                c1=num1[i];
                break;
            }
        }
        for(int i=0; i<num1.size(); i++)
        {
            if(num1[i]==c1)
            {
                num1[i]='9';
            }
        }
        for(int i=0; i<num1.size();i++)
        {
            if(num2[i]==c2)
            {
                num2[i]='0';
            }
        }
        return stoi(num1)-stoi(num2); //max-min
    }
};