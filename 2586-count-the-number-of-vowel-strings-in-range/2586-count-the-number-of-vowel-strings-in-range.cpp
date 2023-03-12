class Solution {
public:
    int vowelStrings(vector<string>& words, int left, int right) {
        int count=0;
        for(int i=left; i<=right; i++)
        {
            char b=words[i][0];
            char e=words[i].back();
            if((b=='a' || b=='e' || b=='i' || b=='o' || b=='u') &&
               (e=='a' || e=='e' || e=='i' || e=='o' || e=='u'))
            {
                count++;
            }
        }
        return count;
    }
};