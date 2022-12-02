class Solution {
    public int[] numberOfPairs(int[] nums) {
        HashSet<Integer> set=new HashSet<>();
        int[] result= new int[2];
        
        int count=0;
        for(int i=0; i<nums.length;i++){
            if(!set.add(nums[i])){
                count++;
                set.remove(nums[i]);
            }
        }
        result[0]=count;
        result[1]=set.size();
     return result;   
    } 
}