class Solution {
    public int equalPairs(int[][] grid) {
                int count=0;
        int n=grid.length;
        int[][] mtx= new int[n][n];
        for(int i=0; i<n;i++)
        {
            int [] a= new int[n];
            for(int j=0; j<n;j++)
            {
                a[j]=grid[j][i];
            }
            mtx[i]=a;
        }
        for(int[] i : grid)
        {
            for(int[] m :mtx)
            {
                if(Arrays.equals(i,m))
                {
                    count++;
                }
            }
        }
        return count;
    }
}