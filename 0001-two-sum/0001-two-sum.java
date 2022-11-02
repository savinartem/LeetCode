class Solution {
    public int[] twoSum(int[] nums, int target) {
        HashMap<Integer, Integer> indxMap= new HashMap<>();
        for(int i=0; i<nums.length; i++){
            int number=(target-nums[i]);
            if(indxMap.containsKey(number)){
                int[] resultArr={indxMap.get(number),i};
                return resultArr;
            }
            indxMap.put(nums[i],i);
        }
        return null;
    }
}