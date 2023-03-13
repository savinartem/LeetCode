class Solution {
    public String largestGoodInteger(String num) {
        String res="";
        
        for(int i=1; i!=num.length()-1; i++)
        {
            if(num.charAt(i-1)==num.charAt(i) && num.charAt(i)==num.charAt(i+1))
            {
                if(res.length()==0)
                {
                    res=num.substring(i-1, i+2);
                }
                else if(num.charAt(i)>res.charAt(0))
                {
                    res=num.substring(i-1, i+2);
                }
            }
        }
        return  res;
    }
}