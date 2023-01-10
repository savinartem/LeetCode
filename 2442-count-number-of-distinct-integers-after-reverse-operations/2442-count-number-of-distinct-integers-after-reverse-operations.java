class Solution {
    public int countDistinctIntegers(int[] nums) {
        HashSet<Integer> set = new HashSet<>();
        
        for(int n: nums){ set.add(n); }
        for(int i=0; i<nums.length;i++){
            set.add(reverse(nums[i]));
        }
        return set.size();
    }
    
    public int reverse(int num){
        int s=0;
        while(num>0){
            s=s*10+num%10;
            num=num/10;
        }
        return s;
    }
}