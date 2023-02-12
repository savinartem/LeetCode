class Solution {
    public int largestCombination(int[] candidates) {
        int n=candidates.length;
        int result=0;
        
        for(int i=0; i<32;i++)
        {
            int count=0;
            for(int j=0; j<n;j++)
            {
                if(((candidates[j]>>i)&1)==1)
                {
                    count++;
                }
            }
            result=Math.max(result,count);
        }
        return result;
    }
}