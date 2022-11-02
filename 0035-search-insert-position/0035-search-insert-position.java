class Solution {
    public int searchInsert(int[] nums, int target) {
        int l=0; 
        int r=nums.length-1;
        int index=0;
        boolean found=false;
        
        while(l<=r && !found){
            index=(l+r)/2;
            if(target==nums[index]){
                found=true;
            }else{
                if(target<nums[index]){
                    r=index-1;
                }else{
                    l=index+1;
                }
            }
        }
        if(!found){
            return l;
        }
        else{
            return index;
        }
    }
}