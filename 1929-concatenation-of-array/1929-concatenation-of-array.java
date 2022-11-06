class Solution {
    public int[] getConcatenation(int[] nums) {
        int x=nums.length;
        int[] ans=new int[x*2];
        for(int i=0; i<x;i++){
            ans[i]=nums[i];
            ans[i+x]=nums[i];
        }
        return ans;
    }
}