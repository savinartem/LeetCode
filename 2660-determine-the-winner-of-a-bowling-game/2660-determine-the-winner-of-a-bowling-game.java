class Solution {
    public int isWinner(int[] player1, int[] player2) {
         int res1=0, res2=0;
        int a=0, b=0; 
        
        for(int i=0; i<player1.length;i++)
        {
            res1+=player1[i];
            res2+=player2[i];
            
            if(a!=0)
            {
                a--;
                res1+=player1[i];
            }
            if(b!=0)
            {
                b--;
                res2+=player2[i];
            }
            if(player1[i]==10)
            {
                a=2;
            }
            if(player2[i]==10)
            {
                b=2;
            }
        }
        if(res1>res2)
        {
            return 1;
        }
        else if(res2>res1)
        {
            return 2;
        }
        else
        {
            return 0;
        }
    }
}