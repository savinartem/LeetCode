class Solution {
    public int[][] onesMinusZeros(int[][] grid) {
        int n=grid.length;
        int m=grid[0].length;
        
        int[] onesRow= new int[n];
        int[] onesCol=new int[m];

        for(int i=0; i<n;i++){
            for(int j=0; j<m;j++){
                if(grid[i][j]==1){
                    onesCol[j]++;
                    onesRow[i]++;
                }
            }
        }
        
        int[][] diff= new int[n][m];
        for(int i=0; i<n;i++){
            for(int j=0; j<m;j++){
                diff[i][j]=onesRow[i]+onesCol[j]-(n-onesRow[i])-(m-onesCol[j]);
            }
        }
        
        return diff;
    }
}