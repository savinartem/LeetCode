class Solution {
public:
    string decodeMessage(string key, string message) {
     map<char, char> km;
        string abc="abcdefghijklmnopqrstuvwxyz";
        int count=0;
        
        for(int i=0; i<key.size(); i++)
        {
            if(key.at(i)!=' ' && !km[key.at(i)])
            {
                km[key.at(i)]=abc.at(count);
                count++;
            }
        }
        
        string result;
        for(int i=0; i<message.size();i++)
        {
            if(message.at(i)==' ')
            {
                result+=' ';
            }
            else
            {
                result+=km[message.at(i)];
            }
        }
        return result;
    }
};