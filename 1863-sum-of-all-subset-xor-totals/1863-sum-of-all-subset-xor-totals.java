class Solution {
    public int subsetXORSum(int[] nums) {
        return rec(nums, 0,0);
    }
    
    public int rec(int arr[], int index, int result){
        if(index==arr.length){ return result; }
        return rec(arr, index+1, result^arr[index])+rec(arr,index+1,result);
    }
}