class Solution {
public:
    vector<int> findThePrefixCommonArray(vector<int>& A, vector<int>& B) {
        int cur=0;
        int n=A.size();
        vector<int> result(n,0);
       vector<int> temp(n+1);
        
        for(int i=0; i<n; i++)
        {
            temp[A[i]]++;
            if(temp[A[i]]==2)
            {
                
                cur++;
            }
             temp[B[i]]++;
            if(temp[B[i]]==2)
            {
               
                cur++;
            }
            result[i]=cur;
        }
        
        return result;
    }
};