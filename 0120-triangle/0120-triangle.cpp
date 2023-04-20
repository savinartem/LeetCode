class Solution {
public:
    int minimumTotal(vector<vector<int>>& triangle) {
        int n=triangle.size();
        int m=triangle[n-1].size();
        int k=2;
        for(int i=n-2; i>=0;i--,k++){
            for(int j=m-k; j>=0; j--){
                triangle[i][j]=triangle[i][j]+min(triangle[i+1][j], triangle[i+1][j+1]);
            }
        }
        return triangle[0][0];  
    }
};