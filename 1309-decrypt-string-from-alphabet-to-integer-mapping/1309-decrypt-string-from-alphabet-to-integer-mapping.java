class Solution {
    public String freqAlphabets(String s) {
        String str="";
        
        for(int i=0;i<s.length();){
            if(i+2<s.length() && s.charAt(i+2)=='#'){
               str+=(char)(Integer.valueOf(s.substring(i,i+2))+'a'-1);
                i+=3;
            }else{
                str+=(char)((s.charAt(i)-'0')+'a'-1);
                i++;
            }
        }
        return str;
        
    }
}