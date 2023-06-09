class Solution {
    public String makeSmallestPalindrome(String s) {
        int i=0;
        int j=s.length()-1;
        char[] c= s.toCharArray();
        
        while(i<j)
        {
            if(c[i]<c[j]) { c[j--]=c[i++]; }
            else
            {
                c[i++]=c[j--];
            }
        }
        return new String(c);
    }
}