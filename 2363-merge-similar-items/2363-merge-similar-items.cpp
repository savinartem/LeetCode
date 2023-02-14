class Solution {
public:
    vector<vector<int>> mergeSimilarItems(vector<vector<int>>& items1, vector<vector<int>>& items2) {
     int arr[1001]={0};
        vector<vector<int>> result;
        
        for(int i=0; i<items1.size(); i++)
        {
            arr[items1[i][0]]=items1[i][1];
        }
        for(int i=0; i<items2.size(); i++)
        {
            arr[items2[i][0]]+=items2[i][1];
        }
        for(int i=0; i<1001; i++)
        {
            vector<int> v;
            if(arr[i]!=0)
            {
                v.push_back(i);
                v.push_back(arr[i]);
                result.push_back(v);
            }
        }
        return result;
    }
};