class Solution {
public:
    vector<vector<int>> sortTheStudents(vector<vector<int>>& score, int k) {
        vector<pair<int, int>> v;
        for(int i=0; i<score.size();i++)
        {
            v.push_back({score[i][k],i});
        }
        sort(v.begin(), v.end(),greater<pair<int,int>>());
        vector<vector<int>> result;
        for(int i=0; i<v.size();i++)
        {
            int row=v[i].second;
            vector<int> temp;
            for(int j=0;j<score[0].size();j++)
            {
                temp.push_back(score[row][j]);
            }
            result.push_back(temp);
        }
        return result;
    }
};