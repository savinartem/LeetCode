class Solution {
    public boolean isPrefixString(String s, String[] words) {
        String str="";
        
        for(int i=0; i<words.length; i++)
        {
            if(s.indexOf(words[i])==-1)
            {
                return false;
            }
            str+=words[i];
            if(s.equals(str))
            {
                return true;
            }
        }
        return false;
    }
}