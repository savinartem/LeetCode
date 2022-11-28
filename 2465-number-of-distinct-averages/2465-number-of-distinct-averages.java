class Solution {
    public int distinctAverages(int[] nums) {
        HashSet<Double> set=new HashSet<>();
        Arrays.sort(nums);
        int min=0;
        int max=nums.length-1;
        while(min<max){
            double avg=(nums[min]+nums[max])/2.0;
            set.add(avg);
            min++;
            max--;
        }
        return set.size();
    }
}