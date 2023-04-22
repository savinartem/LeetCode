class Solution {
    public int[] rowAndMaximumOnes(int[][] mat) {
        int max=0;
        int index=0;
        
        for(int i=0; i<mat.length; i++)
        {
            int val=0;
            for(int j=0; j<mat[0].length; j++)
            {
                if(mat[i][j]==1)
                {
                    val++;
                }
            }
            if(val>max)
            {
                index=i;
                max=val;
            }
        }
        return new int[]{index, max};
        
    }
}