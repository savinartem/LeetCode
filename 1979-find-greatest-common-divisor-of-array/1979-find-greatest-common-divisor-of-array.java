class Solution {
    public int findGCD(int[] nums) {
        int min=Integer.MAX_VALUE;
        int max=Integer.MIN_VALUE;
        
        for(int i=0;i<nums.length;i++)
        {
            if(nums[i]<min)
            {
                min=nums[i];
            }
            if(nums[i]>max)
            {
                max=nums[i];
            }
        }
        int div=max;
        while(div>0)
        {
            if(max%div==0 && min%div==0)
            {
                return div;
            }
            div--;
        }
        return 1;
    }
}