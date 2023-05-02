class Solution {
public:
    void reverseString(vector<char>& s) {
            // Two pointers approach
        int left=0;
        int right=s.size()-1;
        
        while(left<right){
            char temp=s[left];
            s[left]=s[right];
            s[right]=temp;
            left++;
            right--;
        }
    }
};