class Solution {
public:
    bool isHappy(int n) {
     unordered_set <int> set;
        
        while(n!=1)
        {
            auto pos=set.find(n);
            if(pos!=set.end())
            {
                return false;
            }
            set.insert(n);
            int sum=0;
            while(n>0)
            {
                
                int rem=n%10;
                n/=10;
                sum+=rem*rem;
            }
            n=sum;
        }
        return n==1;
    }
};