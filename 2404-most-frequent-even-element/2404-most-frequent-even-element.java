class Solution {
    public int mostFrequentEven(int[] nums) {
     HashMap<Integer, Integer> map= new HashMap<>();
     int n=nums.length;
        
        for(int i=0; i<n;i++){
            
                map.put(nums[i], map.getOrDefault(nums[i],0)+1);
            
        }
       int mfreq=-1;
        int mval=-1;
        for(int i=0; i<n;i++){
            if(nums[i]%2==0 && map.get(nums[i])>mfreq){
                mfreq=map.get(nums[i]);
                mval=nums[i];
            }
            else if(nums[i]%2==0 && map.get(nums[i])==mfreq && nums[i]<mval){
                mval=nums[i];
            }
        }
        return mval;
    }
}