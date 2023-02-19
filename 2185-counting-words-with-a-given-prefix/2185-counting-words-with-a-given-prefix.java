class Solution {
    public int prefixCount(String[] words, String pref) {
     int count=0;
        for(int i=0; i<words.length;i++)
        {
            String str=words[i];
            if(str.length()<pref.length())
            {
                continue;
            }
            if(str.startsWith(pref))
            {
                count++;
            }
        }
        return count;
    }
}