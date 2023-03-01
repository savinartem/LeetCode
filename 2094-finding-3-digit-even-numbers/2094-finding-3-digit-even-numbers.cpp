class Solution {
public:
    vector<int> findEvenNumbers(vector<int>& digits) {
        int freq[10] ={0}; //store freq of each digit
        vector<int> result;
        
        for(int i: digits)
        {
            freq[i]++;
        }
        
        for(int num=100; num<999; num+=2)
        {
            int ones=num%10;
            int tens=(num/10)%10;
            int hundreds=(num/100);
            
            freq[ones]--;
            freq[tens]--;
            freq[hundreds]--;
            
            if(freq[ones]>=0 && freq[tens]>=0 && freq[hundreds]>=0)
            {
                result.push_back(num);
            }
            freq[ones]++;
            freq[tens]++;
            freq[hundreds]++;
            
        }
        
        return result;
    }
};