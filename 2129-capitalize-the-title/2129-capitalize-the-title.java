class Solution {
    public String capitalizeTitle(String title) {
       
        char[] ch = title.toCharArray();
        
        for(int i=0; i<ch.length; i++)
        {
            int start=i;
            while(i<ch.length && ch[i]!=' ')
            {
                ch[i]=Character.toLowerCase(ch[i]);
                i++;
            }
            if(i-start>2)
            {
                ch[start]=Character.toUpperCase(ch[start]);
            }
        }
        
        return String.valueOf(ch);
    }
}