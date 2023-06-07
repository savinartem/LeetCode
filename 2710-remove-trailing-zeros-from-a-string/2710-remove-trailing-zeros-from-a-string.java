class Solution {
    public String removeTrailingZeros(String num) {
        int len=num.length()-1;
        
        while(len>=0)
        {
            if(num.charAt(len)!='0') { break; }
            len--;
        }
        return num.substring(0, len+1); 
        
    }
}