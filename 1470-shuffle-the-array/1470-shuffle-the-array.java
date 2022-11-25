class Solution {
    public int[] shuffle(int[] nums, int n) {
        int[] result= new int[n*2];
        for(int i=0; i<n*2;i++){
            if(i%2==0){
                result[i]=nums[i/2];
            }else{
                result[i]=nums[n+i/2];
            }
        }
        return result;
    }
}