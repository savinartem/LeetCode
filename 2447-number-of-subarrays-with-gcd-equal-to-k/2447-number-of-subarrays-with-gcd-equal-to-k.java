class Solution {
    public int subarrayGCD(int[] nums, int k) {
        int n=nums.length;
        int count=0;
        for(int i=0; i<n;i++){
            int gcd=0;
            for(int j=i; j<n;j++){
                gcd=helper(gcd, nums[j]);
                if(gcd==k){ count++; }
                if( gcd<k){ break; }
            }
        }
        return count;
    }
    
    public int helper(int a, int b){
        if(b==0){ return a; }
        return helper(b,a%b);
    }
}