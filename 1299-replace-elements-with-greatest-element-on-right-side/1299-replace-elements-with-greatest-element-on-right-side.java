class Solution {
    public int[] replaceElements(int[] arr) {
        int rightMax=arr[arr.length-1];
        arr[arr.length-1]=-1;
        for(int i=arr.length-2; i>=0;i--){
            int temp=arr[i];
            arr[i]=rightMax;
           if(rightMax<temp)
           {
               rightMax=temp;
           }
        }
         return arr;
    }
}