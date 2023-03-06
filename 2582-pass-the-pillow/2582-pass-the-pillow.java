class Solution {
    public int passThePillow(int n, int time) {
        int pass=1;
        int result=1;
        
        for(int i=1; i<=time;i++)
        {
            result+=pass;
            if(result==1 || result==n)
            {
                pass*=-1;
            }
        }
        return result;
    }
}