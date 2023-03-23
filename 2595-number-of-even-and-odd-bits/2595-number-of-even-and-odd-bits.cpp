class Solution {
public:
    vector<int> evenOddBit(int n) {
       
        
        int even=0;
        int odd=0;
        
        int i=0;
        
        while(n>0)
        {
            int rem=n%2;
            
            if(i%2==0 && rem==1)
            {
                even++;
            }
            else if(i%2!=0 && rem==1)
            {
                odd++;
            }
            
            i++;
            
            n=n/2;
        }

        return {even, odd};
    }
};