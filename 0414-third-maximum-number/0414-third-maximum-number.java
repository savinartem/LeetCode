class Solution {
    public int thirdMax(int[] nums) {
        int count=1;
        Arrays.sort(nums);
        
        int maxVal=nums[nums.length-1];

       
        for(int i=nums.length-1; i>=0;i--){
                if(nums[i]<maxVal){
                    maxVal=nums[i];
                    count++;
                }
            if(count==3){
                return maxVal;
            }
            }

      
        return nums[nums.length-1];
    }
}