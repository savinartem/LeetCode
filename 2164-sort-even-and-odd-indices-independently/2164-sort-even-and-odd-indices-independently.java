class Solution {
    public int[] sortEvenOdd(int[] nums) {
        int n=nums.length;
        int m=0;
        
        if(n%2==0){ m=n; }  // if even # of elements
        else { m=n+1; }     //if odd
        
        int []oddArr=new int[n/2];
        int[] evenArr=new int[m/2];
        
        int even=0;
        int odd=0;
        
        for(int i=0;i<n;i++){
            if(i%2==0){ evenArr[even++]=nums[i]; }
            else { oddArr[odd++]=nums[i]; }
        }
        
        Arrays.sort(oddArr);
        Arrays.sort(evenArr);
        
        even=0;
        odd=oddArr.length-1;
        
        for(int i=0;i<n;i++){
            if(i%2==0){ nums[i]=evenArr[even++]; }
            else{ nums[i]=oddArr[odd--]; }
        }
        return nums;
    }
}