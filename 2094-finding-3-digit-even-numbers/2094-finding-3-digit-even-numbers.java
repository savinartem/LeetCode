class Solution {
    public int[] findEvenNumbers(int[] digits) {
        TreeSet<Integer> set= new TreeSet<>();
        
        for(int i=0; i<digits.length; i++)
        {
            if(digits[i]==0)
            {
                continue;
            }
            for(int j=0; j<digits.length;j++)
            {
                if(i==j)
                {
                    continue;
                }
            
                for(int k=0; k<digits.length; k++)
                {
                    if(i==k || j==k || digits[k]%2==1)
                    {
                        continue;
                    }
                    int val=100*digits[i]+10*digits[j]+digits[k];
                    set.add(val);
                }
            }
        }
        int[] result=new int[set.size()];
        int i=0;
        
        for(int j: set)
        {
            result[i]=j;
            i++;
        }
        return result;
    }
}