class Solution {
    public int findMaxK(int[] nums) {
        Set<Integer> set=new HashSet<>();
        int max=-1;
        for(int num:nums){
            if(set.contains(-num)){
                max=Math.max(max, Math.abs(num));
            }
            else{
                set.add(num);
            }
        }
        return max;
    }
}