class Solution {
    public int[] separateDigits(int[] nums) {
        String s="";
        for(int i=0; i<nums.length;i++){
            s+=String.valueOf(nums[i]);
            }
        int arr[]=new int [s.length()];
        for(int i=0; i<s.length();i++)
        {
            arr[i]=s.charAt(i)-'0';
        }
        return arr;
    }
}