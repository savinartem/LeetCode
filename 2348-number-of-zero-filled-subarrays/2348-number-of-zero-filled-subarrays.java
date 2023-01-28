class Solution {
    public long zeroFilledSubarray(int[] nums) {
        long result=0;
        long count=0;
        
        for(int i=0; i<nums.length; i++){
            if(nums[i]==0){ count++; }
            else{
                result+=(((count)*(count+1))/2);
                count=0;
            }
        }
        result+=(((count)*(count+1))/2);
        return result;
    }
}

/*
the number of sub arrays 
 n * (n + 1) / 2
*/