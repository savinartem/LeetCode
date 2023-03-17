class Solution {
public:
    int canBeTypedWords(string text, string brokenLetters) {
        
        unordered_set<char> set;
        int count=0;
        int i=0;
        bool t=false;
        
        for(int i=0; i<brokenLetters.size();i++)
        {
            set.insert(brokenLetters[i]);
        }
        
        while(i<=text.size())
        {
            if(set.count(text[i]))
            {
                t=true;
            }
            else if(text[i]==' ' || text[i]=='\0')
            {
                if(!t)
                {
                    count++;
                }
                t=false;
            }
            i++;
        }
        return count;
    }
};