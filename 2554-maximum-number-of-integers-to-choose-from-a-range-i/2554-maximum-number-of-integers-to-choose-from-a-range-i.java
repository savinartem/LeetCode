class Solution {
    public int maxCount(int[] banned, int n, int maxSum) {
        HashSet<Integer> set=new HashSet<>();
        //int len=banned.length;
        int count=0;
        for(int i=0;i<banned.length;i++)
        {
            set.add(banned[i]);
        }
        
        int low=1;
        int sum=0;
        int max=maxSum;
        
        while(low<=n)
        {
            if(set.contains(low))
            {
                low++;
                continue;
            }
            else if(sum+low<=max)
            {
                
                sum+=low;
                count++;
            }
            low++;
        }
        return count;
    }
}