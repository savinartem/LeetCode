class Solution {
    public int semiOrderedPermutation(int[] nums) {
        int min=0; 
        int max=nums.length;
        int n=nums.length;
        for(int i=0; i<n;i++)
        {
            if(nums[i]==1){ min=i; }
            if(nums[i]==n){ max=i; }
        }
        if(min<max) { return (min+n-max-1); }
        return (min+n-max-1)-1;
    }
}