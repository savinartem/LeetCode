class Solution {
    public int hammingDistance(int x, int y) {
        int result=0;//counter
        while (x>0 || y>0){
            result+=(x%2)^(y%2);//access last bits of x and y
                                // if got even we have 0 odd we have 1
            x>>=1;              //shift 
            y>>=1;
        }
        return result;
    }
}