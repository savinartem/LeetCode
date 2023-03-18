class Solution {
public:
    int getLucky(string s, int k) {
        int sum=0;
        
        for(auto a:s)
        {
            int val=(a-'a')+1;
            while(val)
            {
                sum+=val%10;
                val/=10;
            }
        }
        
        while(--k)
        {
            int r=0;
            while(sum)
            {
                r+=sum%10;
                sum/=10;
            }
            sum=r;
        }
        
        return sum;
    }
};