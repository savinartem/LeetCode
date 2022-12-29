class Solution {
    public int myAtoi(String s) {
        s=s.trim();
        
        if(s.length()==0){ return 0; }
        
        boolean sign=false;
        long result=0;
        
        if(s.charAt(0)=='-'){ sign=true; }
        
        int i=(s.charAt(0)=='+' || s.charAt(0)=='-') ? 1 :0;
        
        while(i<s.length()){
            if(s.charAt(i)==' ' || !Character.isDigit(s.charAt(i))){ break; }
            
            result=result*10+s.charAt(i)-'0';
            
            if(sign && -1*result<Integer.MIN_VALUE) { return Integer.MIN_VALUE; }
            else if(!sign && result>Integer.MAX_VALUE) { return Integer.MAX_VALUE; }
            i++;
        }
        if(sign){return (int)(result*(-1));}
        else{ return (int)result; }
    }
}