class Solution {
    public int singleNumber(int[] nums) {
        HashMap<Integer, Integer> map= new HashMap<Integer, Integer>();
        for(int i=0; i<nums.length; i++){
            if(map.containsKey(nums[i])){
                map.remove(nums[i]);
            }else{
                map.put(nums[i],i);
            }
        }
        for(Map.Entry<Integer, Integer> m: map.entrySet()){
            return m.getKey();
        }
        return 0;
    }   
}