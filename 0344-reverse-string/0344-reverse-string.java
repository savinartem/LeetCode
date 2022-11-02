class Solution {
    public void reverseString(char[] s) {
        reverse(0, s);
        
    }
    
    public void reverse(int index, char[] s){
        if(s==null || index>=s.length){ return; }
        else{
            int l=0, r=s.length-1;
            while(l<r){
                char temp;
                temp=s[l];
                s[l]=s[r];
                s[r]=temp;
                l++;
                r--;
            }
        }
    }
}