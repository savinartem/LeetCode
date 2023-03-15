class Solution {
public:
    string reversePrefix(string word, char ch) {
       int i=0;
        int j=0;
        
        while(j<word.length() && word[j]!=ch)
        {
            j++;
        }
        if(j==word.length())
        {
            return word;
        }
        while(i<j)
        {
            swap(word[i], word[j]);
            i++;
            j--;
        }
        return word;
    }
};