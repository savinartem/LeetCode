class Solution {
    public List<Integer> findKDistantIndices(int[] nums, int key, int k) {
        List<Integer> keys= new ArrayList<>();
        List<Integer> result= new ArrayList<>();
        for(int i=0; i<nums.length;i++){
            if(nums[i]==key){ keys.add(i); }
        }
        for(int i=0; i<nums.length;i++){
            for(int j=0; j<keys.size();j++){
                if(Math.abs(i-keys.get(j))<=k){ result.add(i); break; }
            }
        }
        return result;
    }
}