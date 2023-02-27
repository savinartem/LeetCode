class Solution {
    public int timeRequiredToBuy(int[] tickets, int k) {
     
        int time=0;
        int i=0;
        
        while(true)
        {
            if(tickets[i]>0)
            {
                time++;
                tickets[i]--;
            }
            if(i==k && tickets[i]==0)
            {
                return time;
            }
            if(i==tickets.length-1)
            {
                i=0;
            }
            else
            {
                i++;    
            }
        }
    }
}