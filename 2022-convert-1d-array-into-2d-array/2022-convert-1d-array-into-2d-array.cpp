class Solution {
public:
    vector<vector<int>> construct2DArray(vector<int>& original, int m, int n) {
        vector<vector<int>> result(m , vector<int>(n));
        
        int index=0;
        
        if(m*n!=original.size())
        {
            return {};
        }
        
        for(int i=0; i<m;i++)
        {
            for(int j=0;j<n;j++)
            {
                result[i][j]=original[index++];
            }
        }
        
        return result;
    }
};