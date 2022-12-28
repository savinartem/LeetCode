class Solution {
    public int missingNumber(int[] nums) {
        int n=nums.length;
        
        HashMap<Integer, Integer> map =new HashMap<>();
        
        for(int i=0; i<n;i++){
            map.put(nums[i],i);
        }
        for(int i=0; i<=n;i++){
            if(!map.containsKey(i)){ return i; }
        }
        return 0;
    }
}