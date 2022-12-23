class Solution {
    public String toLowerCase(String s) {
       char str[]=s.toCharArray();
        for(int i=0; i<str.length;i++){
            if(str[i]>='A' && str[i]<='Z'){
                str[i]=(char)((int)str[i]+32);
            }
        }
        return String.valueOf(str);
    }
}