class Solution {
public:
    string capitalizeTitle(string title) {
        
        for(int i=0; i<title.length();i++)
        {
            int start=i;
            
            while(i<title.length() && title[i]!=' ')
            {
                title[i]=tolower(title[i]);
                i++;
            }
            if(i-start>2)
            {
                title[start]=toupper(title[start]);
            }
        }
        return title;
    }
};