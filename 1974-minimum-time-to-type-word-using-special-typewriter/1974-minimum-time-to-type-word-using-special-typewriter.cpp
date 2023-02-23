class Solution {
public:
    int minTimeToType(string word) {
        char current='a';
        int result=0;
        
        for(int i=0; i<word.size();i++)
        {
            int dis=abs(word[i]-current);
            int sec=min(dis,26-dis);
            result+=(sec+1);
            current=word[i];
        }
        return result;
    }
};