class Solution {
    public int maximumCount(int[] nums) {
        int neg=0;
        int index=0;
        
        while(index<nums.length && nums[index]<0){
            
                neg++;
                index++;
      
        }
         while(index<nums.length && nums[index]==0){
             index++;
         }
        
        return Math.max(neg, nums.length-index);
        
    }
}