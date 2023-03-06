class Solution {
    public int splitNum(int num) {
        String str=String.valueOf(num);
        char[] digits=str.toCharArray();
        
        Arrays.sort(digits);
        String s1="";
        String s2="";
        
        for(int i=0; i<digits.length; i++)
        {
            if(i%2==0)
            {
                s1+=digits[i];
            }
            else
            {
                s2+=digits[i];
            }
        }
        
        int num1=Integer.valueOf(s1);
        int num2=Integer.valueOf(s2);
        
        return num1+num2;
    }
}