class Solution {
public:
    bool isPalindrome(int x) {
     
        int reverse=0;
        int temp=x;
       // if(x<0){ return false; }
        while(temp>0)
        {
           int reminder=temp%10;
            if(reverse>INT_MAX/10 || reverse<INT_MIN/10){ return false; }
            reverse=reverse*10+reminder;
            temp=temp/10;
        }
        if(x==reverse){ return true; }
        else { return false; }
        
    }
};