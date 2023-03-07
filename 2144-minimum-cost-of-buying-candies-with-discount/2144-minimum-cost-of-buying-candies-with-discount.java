class Solution {
    public int minimumCost(int[] cost) {
        Arrays.sort(cost);
        int result=0;
        
        int count=cost.length-1;
        while(count>=0)
        {
            result+=cost[count];
            count--;
            if(count>=0)
            {
                result+=cost[count];
                count-=2;
            }
        }
        return result;
    }
}