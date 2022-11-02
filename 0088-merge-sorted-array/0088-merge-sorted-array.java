class Solution {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        for(int i=0; i<n;i++){
            nums1[i+m]=nums2[i];
        }
            for(int k=1;k<nums1.length; k++){
                int temp=nums1[k];
                int j=k-1;
                while(j>=0 && temp<nums1[j]){
                    nums1[j+1]=nums1[j];
                    j--;
                }
                nums1[j+1]=temp;
            } 
        Arrays.sort(nums1); 
    }
}