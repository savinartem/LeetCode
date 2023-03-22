class Solution {
public:
    bool strongPasswordCheckerII(string password) {
        int low=0;
        int up=0;
        int digit=0;
        int special=0;
        
        if(password.length()<8){ return false; }
        
        for(int i=0; i<password.length(); i++)
        {
            if(isupper(password[i])){ up++; }
            
            else if(islower(password[i])) { low++;}
            
            else if(isdigit(password[i])) { digit++; }
            
            else { special++; }
                
            if(i<password.length()-1 && password[i]==password[i+1]) { return false; }
        }
        
        return (low>0 && up>0 && digit>0 && special>0);
       
        
    }
};