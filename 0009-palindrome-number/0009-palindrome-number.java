class Solution {
    public boolean isPalindrome(int x) {
        int reminder=0;
        int reverse=0;
        int temp=x;
        if(x<0){
            return false;
        }
        while(temp!=0){
            reminder=temp%10;
            reverse=reverse*10+reminder;
            temp=temp/10;
        }
        if(x==reverse){
            return true;
        }
        else{
            return false;
        }
    }
}