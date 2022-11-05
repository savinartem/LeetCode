class Solution {
    public boolean containsNearbyDuplicate(int[] nums, int k) {
        int size=nums.length;
        HashSet<Integer> set=new HashSet<Integer>();
        
        for(int i=0; i<size;i++){
            if(i-k>0){
                set.remove(nums[i-k-1]);
            }
            if(set.contains(nums[i])){
                return true;
            }else{
                set.add(nums[i]);
            }
        }
        return false;
    }
}