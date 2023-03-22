class Solution {
    public boolean strongPasswordCheckerII(String password) {
        if (password.length()<8) { return false; }
        
        int digit=0;
        int lowcase=0;
        int uppercase=0;
        int specialChar=0;
        
        for(int i=0; i<password.length(); i++)
        {
            char c=password.charAt(i);
            if(Character.isDigit(c)){ digit++; }
            else if( Character.isLowerCase(c)) { lowcase++; }
            else if(Character.isUpperCase(c)) { uppercase++; }
            else if(!Character.isAlphabetic(c)){ specialChar++; }
            
            if (i<password.length()-1 && c==password.charAt(i+1)) { return false; }
        }
        
        return (digit>0 && lowcase>0 && specialChar>0 && uppercase>0);
    }
}