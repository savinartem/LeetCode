class Solution {
    public double calculateTax(int[][] brackets, int income) {
        double result=0;
        int n=brackets.length;
        
        for(int i=0;i<n;i++){
            int upper=brackets[i][0];
            int per=brackets[i][1];
            
            if(i!=0){
                upper=brackets[i][0]-brackets[i-1][0];
            }
            upper=Math.min(upper, income);
            income-=upper;
            result+=(double)(upper*per)/100;
        }
        return result;
    }
}