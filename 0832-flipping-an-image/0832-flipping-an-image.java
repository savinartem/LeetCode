class Solution {
    public int[][] flipAndInvertImage(int[][] image) {
        int n=image.length;
        
        for(int i=0; i<n;i++){
            for(int j=0;j<(n+1)/2;j++){
                int temp=image[i][j];
                image[i][j]=image[i][n-j-1]^1;
                image[i][n-j-1]=temp^1;
            }
        }
        return image;
    }
}