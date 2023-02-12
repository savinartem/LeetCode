class Solution {
public:
    long long findTheArrayConcVal(vector<int>& nums) {
        long long result=0;
        string str="";
        int i=0;
        int j=nums.size()-1;
        
        while(i<=j)
        {
            if(i==j)
            {
                str+=to_string(nums[i]);
            }
            else
            {
                str+=to_string(nums[i])+to_string(nums[j]);
            }
            i++;
            j--;
            result+=stoi(str);
            str="";
        }
        return result;
    }
};