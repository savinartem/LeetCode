class Solution {
    public int distMoney(int money, int children) {
        
        if(children>money){ return -1; }
        
        if(money<8) { return 0; }
        
        int div=money/8;
        int rem=money%8;
        
        if(div==children && rem==0)
        {
            return children;
        }
        
        if(div>=children)
        {
            return children-1;
        }
        
        if(rem==4 && children-div==1)
        {
            return children-2;
        }
        if(rem>=children-div)
        {
            return div;
        }
        int temp=children-div;
        while(rem<temp)
        {
            temp++;
            rem+=8;
            div--;
        }
        
        return div;    
    }
}