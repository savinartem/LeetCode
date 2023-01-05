class Solution {
    public int minimumRecolors(String blocks, int k) {
        int result=Integer.MAX_VALUE;
        int count=0;
        
        for(int i=0, j=0; i<blocks.length();i++){
            if(blocks.charAt(i)=='W'){ count++; }
            
            if(i-j+1==k){
                result=Math.min(result, count);
                if(blocks.charAt(j)=='W'){ count--; }
                j++;
            }
        }
        return result;
    }
}