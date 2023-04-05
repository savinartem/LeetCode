class Solution {
public:
    string sortString(string s) {
        string result="";
        int freq[26]={0};
        int count=0;
        
        for(int i=0; i<s.length(); i++)
        {
            freq[s[i]-'a']++;
            count++;
        }
        
        while(count)
        {
            for(int i=0; i<26;i++)
            {
                if(freq[i]>0)
                {
                    result+=i+'a';
                    count--;
                    freq[i]--;
                }
            }
            for(int i=25; i>=0;i--)
            {
                if(freq[i]>0)
                {
                    result+=i+'a';
                    count--;
                    freq[i]--;
                }
            }
        }
        return result;
    }
};