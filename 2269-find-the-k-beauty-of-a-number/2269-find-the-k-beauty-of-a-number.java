class Solution {
    public int divisorSubstrings(int num, int k) {
        String s = String.valueOf(num);
        int result=0;
        for(int i=0; i<s.length()-k+1;i++)
        {
            int n=Integer.valueOf(s.substring(i,i+k));
            if(n!=0 && num%n==0) { result++; }
        }
        return result;
    }
}