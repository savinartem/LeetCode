class Solution {
public:
    int finalValueAfterOperations(vector<string>& operations) {
        
        int result=0;
        for (int i=0; i<operations.size();i++)
        {
            if(operations[i]=="X++" || operations[i]=="++X")
            {
                result++;
            }
            else
            {
                result--;
            }
        }
        return result;
    }
};