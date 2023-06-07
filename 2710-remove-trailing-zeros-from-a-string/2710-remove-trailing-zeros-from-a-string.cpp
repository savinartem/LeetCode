class Solution {
public:
    string removeTrailingZeros(string num) {
                int len=num.length()-1;
        
        while(len>=0)
        {
            if(num[len]!='0') { break; }
            len--;
        }
        return num.substr(0, len+1); 
    }
};