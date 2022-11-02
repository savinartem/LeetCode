class Solution {
    public int[] sortArrayByParity(int[] nums) {
       int first=0;
        int last=nums.length-1;
        int[] B=new int[nums.length];
        for(int i=0;i<nums.length;i++){
            if(nums[i]%2==0){
                B[first]=nums[i];
                first++;
            }
            else{
                B[last]=nums[i];
                last--;
            }
        }
        return B;
    }
}