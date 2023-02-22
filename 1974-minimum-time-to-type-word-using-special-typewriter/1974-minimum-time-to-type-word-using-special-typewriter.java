class Solution {
    public int minTimeToType(String word) {
        int result=word.length();
        char prev='a';
        
        for(int i=0;i<word.length(); i++)
        {
            char curr=word.charAt(i);
            int step=Math.abs(prev-curr);
            result+=Math.min(step,26-step);
            prev=curr;
        }
        
        return result;
    }
}