class Solution {
    public int secondHighest(String s) {
        int largest=-1;
        int secondL=-1;
        
        for(int i=0; i<s.length();i++)
        {
            char ch=s.charAt(i);
            
            if(!Character.isDigit(ch)){ continue; }
            
            int digit=ch-'0';
            if(digit>largest)
            {
               secondL=largest;
                largest=digit;
            }
            else if(digit<largest && digit>secondL)
            {
                secondL=digit;
            }
        }
        return secondL;
    }
}