class Solution {
    public int[] sumZero(int n) {
        int arr[] = new int[n];
        int d=n/2;
        
        for(int i=0; i<d;i++){
            arr[i]=-(i+1);
            arr[n-i-1]=i+1;
        }
        return arr;
    }
}