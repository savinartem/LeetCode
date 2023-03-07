class Solution {
    public boolean checkValid(int[][] matrix) {
        
        for(int i=0; i<matrix.length;i++)
        {
            HashSet<Integer> hs= new HashSet<>();
            
            for(int j=0; j<matrix.length; j++)
            {
                hs.add(matrix[i][j]);
            }
            if(hs.size()!=matrix.length)
            {
                return false;
            }
        }
        
        for(int i=0; i<matrix.length; i++)
        {
            HashSet<Integer> hs = new HashSet<>();
            for(int j=0; j<matrix.length; j++)
            {
                hs.add(matrix[j][i]);
            }
            if(hs.size()!=matrix.length)
            {
                return false;
            }
        }
        return true;
    }
}