class Solution {
public:
    string longestCommonPrefix(vector<string>& strs) {
        if(strs[0]==""){ return ""; }
        if(strs.size()==1) return strs[0];
        string result;
        char ch;
        bool flag=false;
        
        for(int i=0; i<strs[0].size(); i++){
            for(int j=1; j<strs.size(); j++){
                ch=strs[0][i];
                if(ch!=strs[j][i]){
                    flag=true;
                }
            }
            if(!flag){ result.push_back(ch); }
        }
        return result;
    }
};