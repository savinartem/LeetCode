class Solution {
public:
    int divisorSubstrings(int num, int k) {
        int result=0;
        string s=to_string(num);
        int n=s.size();
        int left=0; 
        int right=k-1;
        string temp=s.substr(left, k);
        int temp1=stoi(temp);
        if(temp1!=0 && num%temp1==0)
        {
            result++;
        }
        left++;
        right++;
        while(right<n)
        {
            temp=s.substr(left,k);
            temp1=stoi(temp);
            if(temp1!=0 && num%temp1==0)
            {
                result++;
            }
            left++;
            right++;
        }
        return result;
    }
};