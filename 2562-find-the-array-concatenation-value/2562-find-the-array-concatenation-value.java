class Solution {
    public long findTheArrayConcVal(int[] nums) {
        String str="";
        long sum=0;
        int i=0;
        int j=nums.length-1;
        
        while(i<=j)
        {
            if(i==j)
            {
                str=String.valueOf(nums[i]);
                sum+=Long.parseLong(str);
            }
            else
            {
                str=String.valueOf(nums[i])+String.valueOf(nums[j]);
                sum+=Long.parseLong(str);
            }
            i++;
            j--;
        }
        return sum;
    }
}