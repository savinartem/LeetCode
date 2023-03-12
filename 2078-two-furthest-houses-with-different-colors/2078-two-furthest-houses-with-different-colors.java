class Solution {
    public int maxDistance(int[] colors) {
        int n=colors.length;
        int i=0;
        int j=n-1;
        
        while(colors[0]==colors[j])
        {
            j--;
        }
        while(colors[n-1]==colors[i])
        {
            i++;
        }
        
        return Math.max(j,n-i-1);
    }
}