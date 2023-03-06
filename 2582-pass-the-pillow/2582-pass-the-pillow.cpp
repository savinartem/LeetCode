class Solution {
public:
    int passThePillow(int n, int time) {
        int t=1;
        int count=0;
        
        if(time<n)
        {
            return time+1;
        }
        
        for(int i=1; i<=time;i++)
        {
            if(t==n)
            {
                count=1;
            }
            if(t==1)
            {
                count=0;
            }
            if(count==1)
            {
                t--;
            }
            if(count==0)
            {
                t++;
            }
        }
        return t;
    }
};