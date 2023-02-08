class Solution {
public:
    long long pickGifts(vector<int>& gifts, int k) {
        priority_queue<int> q;
        for(int i=0; i<gifts.size();i++)
        {
            q.push(gifts[i]);
        }
        while(k--)
        {
            int a=q.top();
            q.pop();
            a=sqrt(a);
            q.push(a);
        }
        long long result=0;
        while(!q.empty())
        {
            result+=q.top();
            q.pop();
        }
        return result;
    }
};