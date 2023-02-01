class Solution {
public:
    int alternateDigitSum(int n) {
        int i=0;
        int sum=0;
        int reverse=0;
        int m=n;
        
        while(m!=0)
        {
            int rem=m%10;
            reverse=reverse*10+rem;
            m=m/10;
        }
        
        n=reverse;
        
        while(n!=0)
        {
            i++;
            int rem=n%10;
            if(i%2==0)
            {
                rem=-rem;
            }
            sum+=rem;
            n=n/10;
        }
        return sum;
    }
};