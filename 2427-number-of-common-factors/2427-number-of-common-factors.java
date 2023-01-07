class Solution {
    public int commonFactors(int a, int b) {
        int n=Math.max(a,b);
        int result=1;
        
        for(int i=2; i<=n;i++){
            if(a%i==0 && b%i==0){
                result++;
            }
        }
        return result;
    }
}