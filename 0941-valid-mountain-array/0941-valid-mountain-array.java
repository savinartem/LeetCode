class Solution {
    public boolean validMountainArray(int[] arr) {
        int count=0;
        while(count<arr.length-1 && arr[count]<arr[count+1]){
            count++;
        }
        if(count==0 || count==arr.length-1){
            return false;
        }
        while(count<arr.length-1 && arr[count]>arr[count+1]){
            count++;
        }
        if(count==arr.length-1){
            return true;
        }
        else{
            return false;
        }
    }
}