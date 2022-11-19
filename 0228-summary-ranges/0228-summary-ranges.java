class Solution {
    public List<String> summaryRanges(int[] nums) {
        ArrayList<String> result=  new ArrayList<>();
        int n= nums.length;
        if(n==0){
            return result;
        }
        int a=nums[0];
        for(int i=0; i<n;i++){
            //last element or next element!=current
            if(i==n-1 || nums[i]+1!=nums[i+1]){
                if(nums[i]!=a){
                    result.add(a+"->"+nums[i]);
                }else{
                    result.add(a+"");
                }if(i!=n-1){
                    a=nums[i+1];
                }
            }
        }
        return result;
    }
}