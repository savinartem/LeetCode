class Solution {
    public int minimumRecolors(String blocks, int k) {
        int low=0;
        int hight=0;
        int wh=0;
        int min=Integer.MAX_VALUE;
        
        while(hight<blocks.length()){
            if(blocks.charAt(hight)=='W'){ wh++; }
            
            if(hight-low+1<k){ hight++; }
            
            else if(hight-low+1==k){
                min=Math.min(min, wh);
                if(blocks.charAt(low)=='W'){ wh--; }
                low++;
                hight++;
            }
        }
        return min;
    }
}