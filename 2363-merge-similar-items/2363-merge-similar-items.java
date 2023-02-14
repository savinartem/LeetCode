class Solution {
    public List<List<Integer>> mergeSimilarItems(int[][] items1, int[][] items2) {
        List<List<Integer>> result = new ArrayList<>();
       
        int tempArr[] =new int[1001];
        for(int i=0; i<items1.length; i++)
        {
            int val = items1[i][0];
            int weight=items1[i][1];
            tempArr[val]=weight;
        }
        
        for(int i=0; i<items2.length;i++)
        {
            int val = items2[i][0];
            int weight=items2[i][1];
            tempArr[val]+=weight;
        }
        
        for(int i=0;i<tempArr.length;i++)
        {
            if(tempArr[i]>0)
            {
                List<Integer> ls= new ArrayList<>();
                ls.add(i);
                ls.add(tempArr[i]);
                result.add(ls);
            }
        }
      return result;
    }
}