class Solution {
    public int heightChecker(int[] heights) {
        int tempArr[]=new int[heights.length];
        
        for(int i=0; i<heights.length;i++){
            tempArr[i]=heights[i];
        }
        
        Arrays.sort(tempArr);
        int count=0;
        
        for(int i=0; i<heights.length;i++){
            if(tempArr[i]!=heights[i]){
                count++;
            }
        }
        return count;
    }
}