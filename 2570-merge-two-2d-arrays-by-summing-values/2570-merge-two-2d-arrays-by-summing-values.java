class Solution {
    public int[][] mergeArrays(int[][] nums1, int[][] nums2) {
        TreeMap<Integer, Integer> map= new TreeMap<>();
        
        for(int i=0; i<nums1.length;i++)
        {
            if(!map.containsKey(nums1[i][0]))
            {
               map.put(nums1[i][0],nums1[i][1]); 
            }
            else
            {
                map.put(nums1[i][0], map.get(nums1[i][0]+nums1[i][1]));
            }
        }
        
        for(int i=0; i<nums2.length;i++)
        {
            
            if(!map.containsKey(nums2[i][0]))
            {
                map.put(nums2[i][0],nums2[i][1]);
            }
            else
            {
                map.put(nums2[i][0], map.get(nums2[i][0])+nums2[i][1]);
            }
        }
        int[][] result = new int[map.size()][2];
        int i=0;
        for(Map.Entry<Integer, Integer> mapEntry : map.entrySet())
        {
            result[i][0]=mapEntry.getKey();
            result[i][1]=mapEntry.getValue();
            i++;
        }
        
        return result;
    }
    
}