class Solution {
    public int maximizeSum(int[] nums, int k) {
        Arrays.sort(nums);
        
        int max= nums[nums.length-1];
        int res=max;
        
        for(int i=1; i<k; i++)
        {
            res+=(max+i);
        }
        return res;
    }
}