class Solution {
    public int countVowelStrings(int n) {
        int dp[]={1,1,1,1,1};
        for(int i=0;i<n;i++){
            for(int j=1;j<5;j++)
            {
                dp[j]+=dp[j-1];
            }
            }
        return dp[4];
    }
}