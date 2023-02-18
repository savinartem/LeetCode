class Solution {
    public int divisorSubstrings(int num, int k) {
        
        String t="";
        String S=Integer.toString(num);
        int c=0;
        int i=0;
        int j=0;
        
        while(j<S.length())
        {
            t+=S.charAt(j);
            if(j-i+1<k){ j++; }
            else if(j-i+1==k)
            {
                int a=Integer.parseInt(t.substring(i,i+k));
                if(a!=0 && num%a==0) { c++; }
                i++;
                j++;
            }
        }
        return c;
    }
}