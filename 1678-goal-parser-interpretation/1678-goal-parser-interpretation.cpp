class Solution {
public:
    string interpret(string command) {
        string result;
        
        int i=0;
        
        while(i<command.size())
        {
            if(command[i]=='(' && command[i+1]==')')
            {
                result+="o";
                i+=2;
            }
            else if(command[i]=='(' && command[i+1]=='a' 
                    && command[i+2]=='l' && command[i+3]==')')
            {
                result+="al";
                i+=4;
            }
            else
            {
                result+=command[i];
                i++;
            }
        }
        return result;
    }
};