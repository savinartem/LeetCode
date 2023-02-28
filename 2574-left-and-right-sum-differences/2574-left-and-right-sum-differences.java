class Solution {
    public int[] leftRigthDifference(int[] nums) {
        
        int totalSum=0;
        int leftSum=0;
        int[] answer=new int[nums.length];
        
        for(int i=0; i<nums.length;i++)
        {
            totalSum+=nums[i];
        }
        
        for(int i=0; i<nums.length;i++)
        {
            int rightSum=totalSum-leftSum-nums[i];
            answer[i]=Math.abs(leftSum-rightSum);
            leftSum+=nums[i];
        }
        
        return answer;
    }
}