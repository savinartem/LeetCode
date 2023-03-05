class Solution {
    public int countKDifference(int[] nums, int k) {
        int count=0;
        int diff=0;
        
        for(int i=0; i<nums.length;i++){
            for(int j=i+1;j<nums.length;j++){
                diff=nums[i]-nums[j];
            if(diff==k || 0-diff==k)
            {
                count++;
            }
        }
    }
        return count;
    }
}