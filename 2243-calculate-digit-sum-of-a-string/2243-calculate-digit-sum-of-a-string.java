class Solution {
    public String digitSum(String s, int k) {
        int len=s.length();
        int sum=0;
        String temp="";
        
        while(len>k){
            
            for(int i=0; i<len;i++){
                if(i%k==0 && i>0){
                    temp+=String.valueOf(sum);
                    sum=0;
                }
                sum+=s.charAt(i)-'0';
            }
            temp+=String.valueOf(sum);
            s=temp;
            temp="";
            sum=0;
            len=s.length();
        }
        
        return s;
    }
}