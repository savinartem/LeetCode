class Solution {
    public int mostFrequentEven(int[] nums) {
     HashMap<Integer, Integer> map= new HashMap<>();
     int n=nums.length;
        
        for(int i=0; i<n;i++){
            if(nums[i]%2==0){
                map.put(nums[i], map.getOrDefault(nums[i],0)+1);
            }
        }
        int max=-1;
        int freq=-1;
        for(int i=0; i<n;i++){
            if(nums[i]%2==0){
                if(map.get(nums[i])>freq){
                    max=nums[i];
                    freq=map.get(nums[i]);
                }else if(map.get(nums[i])==freq){
                    max=max<nums[i]?max:nums[i];
                }
            }
        }
        return max;
    }
}