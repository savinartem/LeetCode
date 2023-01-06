class Solution {
    public int averageValue(int[] nums) {
        int sum=0;
        int count=0;
        
        for(int i=0; i<nums.length;i++){
            if(nums[i]%2==0 && nums[i]%3==0){
                count++;
                sum+=nums[i];
            }
        }
        if(count==0){ return 0; }
        return (int)sum/count; // we can do  return count == 0 ? 0 : sum/count;
    }
}