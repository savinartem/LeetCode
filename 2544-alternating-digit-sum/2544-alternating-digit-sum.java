class Solution {
    public int alternateDigitSum(int n) {
        String str=String.valueOf(n);
        char[] ch=str.toCharArray();
        
        int result=0;
        
        for(int i=0; i<ch.length;i++){
            if(i%2==0){
                result+=Integer.parseInt(String.valueOf(ch[i]));
            }else{
                result-=Integer.parseInt(String.valueOf(ch[i]));
            }
        }
        return result;
    }
}