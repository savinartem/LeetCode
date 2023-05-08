class Solution {
public:
    int maxProfit(vector<int>& prices) {
          int buyPrice=prices[0];
        int profit=0;
        
        for(int i=0; i<prices.size()-1;i++){
            int tempProfit=prices[i+1]-prices[i];
            if(tempProfit>0){
                if(prices[i]<buyPrice){
                    buyPrice=prices[i];
                }
                if(prices[i+1]-buyPrice>profit){
                    profit=prices[i+1]-buyPrice;
                }
            }
        }
        return profit;
    }
};