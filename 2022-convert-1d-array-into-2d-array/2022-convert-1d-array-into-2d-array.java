class Solution {
    public int[][] construct2DArray(int[] original, int m, int n) {
        
        int [][] arr = new int[m][n];
        
        if(original.length!=m*n)
        {
            return new int [0][0];
        }
        
        int inx=0;
        for(int i=0; i<arr.length;i++)
        {
            for(int j=0; j<arr[0].length;j++)
            {
                arr[i][j]=original[inx++];
            }
        }
        
        return arr;
    }
}