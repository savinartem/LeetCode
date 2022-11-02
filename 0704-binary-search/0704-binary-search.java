class Solution {
    public int search(int[] nums, int target) {
        int first=0, last=nums.length-1;
        int index=0;
        boolean found=false;
        
        while(first<=last && !found)
        {
            index=(first+last)/2;
            if(nums[index]==target){
                found=true;
            }
            else{
                if(target<nums[index]){
                    last=index-1;
                }
                else{
                    first=index+1;
                }
            }
        }
        if(found){ return index;}
        else{ return -1; }
        
    }
}