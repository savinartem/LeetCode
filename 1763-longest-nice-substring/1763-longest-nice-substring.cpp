class Solution {
public:
    string longestNiceSubstring(string s) {
        if(s.length()<=1) { return ""; }
        
        unordered_set<char> st;
        
        for(int i=0; i<s.length(); i++)
        {
            st.insert(s[i]);
        }
        for(int i=0; i<s.length(); i++)
        {
            char ch=s[i];
            if(st.find(tolower(ch))==st.end()
               || st.find(toupper(ch))==st.end())
            {
                string s1=longestNiceSubstring(s.substr(0,i));
                string s2=longestNiceSubstring(s.substr(i+1, s.length()));
                
                if(s1.length()>=s2.length()){ return s1; }
                else { return s2; }
            }
        }
        return s;
    }
};