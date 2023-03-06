class Solution {
public:
    int splitNum(int num) {
        int num1=0;
        int num2=0;
        
        string str=to_string(num);
        sort(str.begin(), str.end());
        
        for(int i=0; i<str.size(); i++)
        {
            if(i%2==0)
            {
                num1=(num1*10)+(str[i]-'0');
            }
            else
            {
                num2=(num2*10)+(str[i]-'0');
            }
        }
        return num1+num2;
    }
};