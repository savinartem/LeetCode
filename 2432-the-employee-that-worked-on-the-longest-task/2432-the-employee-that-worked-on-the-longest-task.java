class Solution {
    public int hardestWorker(int n, int[][] logs) {
        int longestTask=logs[0][1];
        int empId=logs[0][0];
        
        
        for(int i=1;i<logs.length;i++){
            if(logs[i][1]-logs[i-1][1]==longestTask){
                empId=Math.min(empId, logs[i][0]);
            }else if(logs[i][1]-logs[i-1][1]>longestTask){
                longestTask=logs[i][1]-logs[i-1][1];
                empId=logs[i][0];
            }
        }
        return empId;
    }
}