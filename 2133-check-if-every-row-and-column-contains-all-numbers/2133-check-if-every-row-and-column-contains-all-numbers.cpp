class Solution {
public:
    bool checkValid(vector<vector<int>>& matrix) {
        
        int n=matrix.size();
        
        unordered_set<int> row;
        unordered_set<int> col;
        
        for(int i=0; i<matrix.size();i++)
        {
            for(int j=0; j<matrix.size(); j++)
            {
                row.insert(matrix[i][j]);
                col.insert(matrix[j][i]);
            }
            if(row.size()!=matrix.size() || col.size()!=matrix.size())
            {
                return false;
            }
            row.clear();
            col.clear();
        }
        
        return true;
    }
};