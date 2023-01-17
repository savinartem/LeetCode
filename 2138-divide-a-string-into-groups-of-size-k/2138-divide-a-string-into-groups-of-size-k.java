class Solution {
    public String[] divideString(String s, int k, char fill) {
        StringBuilder sb = new StringBuilder(s);
        String[] result;
        int n=0;
        
        if(s.length()%k==0){
            result=new String[s.length()/k];
        }else{
            result= new String[s.length()/k+1];
        }
        
        while(sb.length()>=k){
            result[n]=sb.substring(0,k);
            sb.delete(0,k);
            n++;
        }
        
        if(sb.length()>0){
            int len=sb.length();
            for(int i=0; i<k-len;i++){
                sb.append(fill);
            }
            result[n]=sb.substring(0);
        }
        return result;
    }
}