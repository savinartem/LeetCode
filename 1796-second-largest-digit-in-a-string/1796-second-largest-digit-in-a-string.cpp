class Solution {
public:
    int secondHighest(string s) {
       int largest=-1;
        int secondL=-1;
        
        for(int i=0; i<s.length(); i++)
        {
            if(s[i]>='0' && s[i]<='9')
            {
                int digit=s[i]-'0';
                if(digit>largest)
                {
                    secondL=largest;
                    largest=digit;
                }
                else if(digit<largest && digit>secondL)
                {
                    secondL=digit;
                }
            }
        }
        return secondL;
    }
};