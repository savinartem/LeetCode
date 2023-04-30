class Solution {
    public int missingNumber(int[] nums) {
        int n=nums.length;
        
        int sumExpected=(n*(n+1))/2;
        int sum=0;
        
        for(int i=0; i<n;i++){
            sum+=nums[i];
        }

        return sumExpected-sum;
    }
}