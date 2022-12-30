class Solution {
    public int captureForts(int[] forts) {
        int result=0;
        int j=0;
        for(int i=0; i<forts.length;i++){
            if(forts[i]!=0){
                if(forts[j]==-forts[i]){
                    result=Math.max(result,i-j-1 );
                }
                j=i;
            }
        }
        return result;
    }
}