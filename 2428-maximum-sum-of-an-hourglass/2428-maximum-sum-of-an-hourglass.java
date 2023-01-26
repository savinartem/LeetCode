class Solution {
    public int maxSum(int[][] grid) {
        int i=0;
        int j=0;
        int max=0;
        
        while(i<grid.length-2){
            int sum=grid[i][j]+
                grid[i][j+1]+
                grid[i][j+2]+
                grid[i+1][j+1]+
                grid[i+2][j]+
                grid[i+2][j+1]+
                grid[i+2][j+2];
            max=Math.max(max,sum);
            j++;
            if(j==grid[0].length-2){
                j=0;
                i++;
            }
        }
        return max;
        
    }
}