class Solution {
    public int[] findThePrefixCommonArray(int[] A, int[] B) {
        int cur=0;
        int result[]=new int[A.length];
       int temp[]=new int[A.length+1];
        
        for(int i=0; i<A.length; i++)
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
}