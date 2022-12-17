class Solution {
    public int dominantIndex(int[] nums) {
        int firstMax=0;
        int secondMax=0;
        int index=0;
        
        for(int i=0; i<nums.length;i++){
            if(nums[i]>firstMax){
                secondMax=firstMax;
                firstMax=nums[i];
                index=i;
            }
            else if(nums[i]>secondMax){
                secondMax=nums[i];
            }
        }
        if(firstMax>=2*secondMax){
            return index;
        } else{
            return -1;
        }
    }
}