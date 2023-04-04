class Solution {
public:
    int numRescueBoats(vector<int>& people, int limit) {
        int count=0;
        
        sort(people.begin(), people.end());
        
        int left=0;
        int right=people.size()-1;
        
        while(left<=right)
        {
            int sum=people[left]+ people[right];
            
            if(sum<=limit)
            {
                count++;
                left++;
                right--;
            }
            else
            {
                count++;
                right--;
            }
        }
        return count;
    }
};