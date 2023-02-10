class Solution {
public:
    int pivotInteger(int n) {
       vector<int> pref;
        int temp=0;
        
        for(int i=1;i<=n;i++)
        {
            temp+=i;
            pref.push_back(temp);
        }
        
        for(int i=0;i<n;i++)
        {
            if(i==0)
            {
                if(pref[i]==pref[n-1])
                {
                    return 1;
                }
                continue;
            }
            if(pref[i]==pref[n-1]-pref[i-1])
            {
                return i+1;    
            }
        }
        return -1;
    }
};