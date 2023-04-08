class Solution {
    public int minPairSum(int[] nums) {
        //To find min pair of sum we add min # and max #
        int result=0;
        int sum=0;
        
        Arrays.sort(nums);
        
        for(int i=0; i<nums.length/2; i++)
        {
            sum=(nums[i]+nums[(nums.length)-1-i]);
            result=Math.max(result, sum);
        }
        return result;
    }
}