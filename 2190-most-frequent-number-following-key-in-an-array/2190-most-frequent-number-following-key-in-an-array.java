class Solution {
    public int mostFrequent(int[] nums, int key) {
        int[] arr=new int[1001];
        int maxCount=0;
        
        int result=-1;
        for(int i=0; i<nums.length-1;i++){
            int temp=nums[i];
            if(temp==key){
                int count=arr[nums[i+1]];
                arr[nums[i+1]]++;
                count++;
                if(maxCount<count){
                    maxCount=count;
                    result=nums[i+1];
                }
            }
            }
        return result;   
    }
}