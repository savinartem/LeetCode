class Solution {
    public int[] plusOne(int[] digits) {
        int N=digits.length-1;
        int i=N;
        
        while(i>=0){
            if(digits[i]!=9){
                digits[i]+=1;
                return digits;
            }else{
                digits[i]=0;
            }
            i--;
        }
        if(digits[0]==0){
            digits=new int[digits.length+1];
            digits[0]=1;
            
        }
        return digits;
    }
}