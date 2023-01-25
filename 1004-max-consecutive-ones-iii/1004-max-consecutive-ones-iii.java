class Solution {
    public int longestOnes(int[] nums, int k) {
        int left=0;
        int zeroCount=0;
        int oneCount=0;
        int max=0;
        
        //i represent right
        for(int i=0;i<nums.length;i++){
            if(nums[i]==0){ zeroCount++; }
            else { oneCount++; }
            
                while(zeroCount>k){
                    if(nums[left]==0){ zeroCount--; }
                    else { oneCount--; }
                    left++;
                 }
            
            max=Math.max(max, i-left+1);
        }
        
        return max;
        
    }
}