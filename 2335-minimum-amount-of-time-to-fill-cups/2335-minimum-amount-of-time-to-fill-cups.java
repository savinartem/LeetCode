class Solution {
    public int fillCups(int[] amount) {
        int max=0;
        int sum=0;
        
        //go throught the array to find max # of cups
        for(int i=0; i<amount.length; i++)
        {
            sum+=amount[i];
            max=Math.max(max, amount[i]);
        }
        
        return Math.max(max,(sum+1)/2);
    }
}