class Solution {
    public int[] getNoZeroIntegers(int n) {
        int a=n;
        int b=0;
        
        while(hasZero(a) || hasZero(b)){
            a--;
            b++;
        }
        int[] result= {a,b};
        return result;
    }
    public boolean hasZero(int x){
        if(x==0){return true;}
        while(x!=0){
            int temp=x%10;
            if(temp==0){ return true; }
            x/=10;
        }
        return false;
    }
}