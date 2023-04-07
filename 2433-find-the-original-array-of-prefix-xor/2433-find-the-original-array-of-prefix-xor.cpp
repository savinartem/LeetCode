class Solution {
public:
    vector<int> findArray(vector<int>& pref) {
        int a=pref[0];
        int b=pref[0];
        
        
        for(int i=1;i<pref.size();i++){
            a=pref[i];
            pref[i]=(pref[i]^b);
            b=a;
        }
        return pref;
    }
};