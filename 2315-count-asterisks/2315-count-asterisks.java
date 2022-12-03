class Solution {
    public int countAsterisks(String s) {
     int open=0;
        int count=0;
        for(int i=0; i<s.length();i++){
            if(s.charAt(i)=='|' && open==0){ open++; }
            else if(s.charAt(i)=='|' && open>0){ open--; }
            else if(s.charAt(i)=='*' && open==0){ count++; }
        }
        return count;
    }
}