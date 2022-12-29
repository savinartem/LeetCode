class Solution {
    public int closetTarget(String[] words, String target, int startIndex) {
        int result=Integer.MAX_VALUE;
        int n=words.length;
        int steps=0;
        for(int i=0; i<n;i++){
            if(words[i].equals(target)){
                steps=Math.abs(i-startIndex);
                result=Math.min(result, steps);
                result=Math.min(result, n-steps);
            }
        }
        return result==   Integer.MAX_VALUE ? -1: result;
    }
}
