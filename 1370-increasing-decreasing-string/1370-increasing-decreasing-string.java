class Solution {
    public String sortString(String s) {
        int len=s.length();
        int[] freq= new int[26];
        
        for(int i=0; i<len; i++)
        {
            freq[s.charAt(i)-'a']++;
        }
        
        StringBuilder sb= new StringBuilder();
        int count=0;
        
        while(count<len)
        {
            for(int i=0; i<26; i++)
            {
                if(freq[i]>0)
                {
                    sb.append((char)(i+'a'));
                    freq[i]--;
                    count++;
                }
            }
            for(int i=25; i>=0; i--)
            {
                if(freq[i]>0)
                {
                    sb.append((char)(i+'a'));
                    freq[i]--;
                    count++;
                }
            }
        }
        return sb.toString();
        
    }
}