class Solution {
    public int[] decode(int[] encoded) {
        int[] original=new int[encoded.length+1];
        int n=encoded.length+1;
        
        //need find first number
        //take XOR of all elements 1^2^3..^n
        int temp=0;
        for(int i=1; i<=n;i++){
            temp=temp^i;
        }
        int encodedXORs=0;
        //endoced[1]^.... all except endoced[0] 
        for(int i=1; i<encoded.length;i+=2){//take only odds
            encodedXORs=encodedXORs^encoded[i];
        }
        original[0]=temp^encodedXORs;
        for(int i=1;i<n;i++){
            original[i]=original[i-1]^encoded[i-1];
        }
        return original;
    }
}