class Solution {
    public boolean isHappy(int n) {
        Set<Integer> hs= new HashSet<>();
        
        int sqSum;
        int remain=0;
        
        while(hs.add(n))
        {
            sqSum=0;
            while(n>0)
            {
                remain=n%10;
                sqSum+=remain*remain;
                n/=10;
            }
            if(sqSum==1)
            {
                return true;
            }
            else
            {
                n=sqSum;
            }
        }
        return false;
    }
}