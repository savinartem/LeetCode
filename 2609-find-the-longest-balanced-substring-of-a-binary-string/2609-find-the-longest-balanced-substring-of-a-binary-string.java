class Solution {
    public int findTheLongestBalancedSubstring(String s) {
        int result=0;
        String temp="01";
        
        while(temp.length()<=s.length())
        {
            if(s.contains(temp))
            {
                result=temp.length();
            }
            temp="0"+temp+"1";
        }
        return result;
    }
}