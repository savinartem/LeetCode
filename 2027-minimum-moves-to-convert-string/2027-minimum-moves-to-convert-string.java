class Solution {
    public int minimumMoves(String s) {
        int count=0;
        
        for(int i=0; i<s.length();)
        {
            if(s.charAt(i)=='X')
            {
                count++;
                i+=3;
            }
            else
            {
                i++;
            }
        }
        return count;
    }
}