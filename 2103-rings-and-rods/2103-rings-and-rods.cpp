class Solution {
public:
    int countPoints(string rings) {
        map<int, set<char>> mp;
        int result=0;
        for(int i=1;i<rings.length(); i+=2)
        {
            mp[rings[i]].insert(rings[i-1]);
        }
        for(auto i:mp)
        {
            if(i.second.size()==3)
            {
                result++;
            }
        }
        return result;
    }
};