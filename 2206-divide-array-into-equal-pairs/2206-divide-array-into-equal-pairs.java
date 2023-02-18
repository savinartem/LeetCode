class Solution {
    public boolean divideArray(int[] nums) {
        Arrays.sort(nums);
        for(int i=0; i<nums.length-1;i++)
        {
            if(nums[i]==nums[i+1])
            {
                i++;
                continue;
            }
            else 
            {
                return false;
            }
        }
        return true;
    }
}