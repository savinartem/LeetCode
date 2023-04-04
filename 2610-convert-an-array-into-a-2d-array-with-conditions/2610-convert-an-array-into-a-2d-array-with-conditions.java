class Solution {
    public List<List<Integer>> findMatrix(int[] nums) {
        ArrayList<List<Integer>> result= new ArrayList<>();
        
        int n=nums.length;
        int count[]= new int[n+1];
        
        for(int i=0; i<n;i++)
        {
            if(result.size()<=count[nums[i]])
            {
                result.add(new ArrayList<>());
                
            }
          //  count[nums[i]]++;
            result.get(count[nums[i]]++).add(nums[i]);
        }
        
        return result;
        
    }
}