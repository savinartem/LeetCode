class Solution {
    public int xorAllNums(int[] nums1, int[] nums2) {
        int a=0;
        int b=0;
        
        for(int i=0; i<nums1.length; i++)
        {
            a^= nums1[i];
        }
        for(int j=0; j<nums2.length;j++)
        {
            b^=nums2[j];
        }
        
        return (nums1.length % 2 *b) ^ (nums2.length % 2*a);
    }
}