class Solution {
    public int reverse(int x) {
        boolean negative = false;
        int num=x;
        if(num<0){ 
            negative=true;
            num*=-1;
        }
        
        long reverse=0;
        while(num>0){
            reverse=(reverse*10)+(num%10);
            num/=10;
        }
        if(reverse>Integer.MAX_VALUE){ return 0; }
        
        else if(x<0){
            return (int)reverse*(-1);
        }
        else { return (int)reverse; }
    }
}