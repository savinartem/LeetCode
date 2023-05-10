class Solution {
    public int[] distinctDifferenceArray(int[] nums) {
        HashMap<Integer, Integer> prefix= new HashMap<>();
        HashMap<Integer, Integer> suffix= new HashMap<>();
        int[] result = new int[nums.length];
        
        for(int x: nums)
        {
            suffix.put(x, suffix.getOrDefault(x, 0)+1);
        }
        
        for(int i=0; i<nums.length; i++)
        {
            int temp= nums[i];
            prefix.put(temp, prefix.getOrDefault(temp,0)+1);
            suffix.put(temp, suffix.get(temp)-1);
            
            if(suffix.get(temp)==0)
            {
                suffix.remove(temp);
            }
            result[i]=prefix.size()-suffix.size();
        }
        return result;
        
    }
}