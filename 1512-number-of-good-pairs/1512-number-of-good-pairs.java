class Solution {
    public int numIdenticalPairs(int[] nums) {
        int count=0;
        HashMap<Integer, Integer> good= new HashMap<>();
        for(int i=0; i<nums.length;i++){
            if(good.containsKey(nums[i])){
                count+=good.get(nums[i]);
                good.put(nums[i], good.get(nums[i])+1);
            }else {
                good.put(nums[i],1);
            }
        }
        return count;
    }
}