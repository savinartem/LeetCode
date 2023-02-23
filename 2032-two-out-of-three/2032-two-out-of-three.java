class Solution {
    public List<Integer> twoOutOfThree(int[] nums1, int[] nums2, int[] nums3) {
        HashSet<Integer> result= new HashSet<>();
        HashSet<Integer> set1= new HashSet<>();
        HashSet<Integer> set2= new HashSet<>();
        
        for(int i=0; i<nums1.length; i++)
        {
            set1.add(nums1[i]);
        }
        
        for(int i=0; i<nums2.length;i++)
        {
            if(set1.contains(nums2[i]))
            {
                result.add(nums2[i]);
            }
            else
            {
                set2.add(nums2[i]);
            }
        }
        
        for(int i=0; i<nums3.length;i++)
        {
            if(set1.contains(nums3[i]) || set2.contains(nums3[i]))
                result.add(nums3[i]);
        }
        return new ArrayList(result);
    }
    
}