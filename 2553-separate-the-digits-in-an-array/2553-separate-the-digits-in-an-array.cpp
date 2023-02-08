class Solution {
public:
    vector<int> separateDigits(vector<int>& nums) {
        vector<int> result;
        stack<int> st;
        
        for(int i=0; i<nums.size(); i++)
        {
            int temp=nums[i];
            while(temp!=0)
            {
                int digit=temp%10;
                st.push(digit);
                temp/=10;
            }
            while(!st.empty())
            {
                result.push_back(st.top());
                st.pop();
            }
        }
        return result;
    }
};