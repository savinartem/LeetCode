class Solution {
    public int pivotInteger(int n) {
        for(int i=1; i<=n;i++){
            int lhs=(i*(i+1)/2);
            int rhs=(n*(n+1)/2)-(i*(i-1))/2;
            
            if(lhs==rhs) { return i; }
        }
        return -1;
    }
}
/*

    math part:
    1+2+3+...+x=x+(x+1)+...+n
    
    lhs=(1+x)*x/2
    rhs=(x+n)*(n-x+1)/2

*/