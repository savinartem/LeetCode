class Solution {
    public int xorBeauty(int[] nums) {
        int result=0;
        for(int i=0; i<nums.length;i++){
            result^=nums[i];
        }
        return result;
    }
}