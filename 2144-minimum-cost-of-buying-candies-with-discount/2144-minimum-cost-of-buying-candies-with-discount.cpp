class Solution {
public:
    int minimumCost(vector<int>& cost) {
        sort(cost.begin(), cost.end(), greater());
        int result=0;
        int count=0;
        
        for(int i=0; i<cost.size();i++)
        {
            if(count==2)
            {
                count=0;
                continue;
            }
            result+=cost[i];
            count++;
        }
        return result;
    }
};