class Solution {
public:
    int convertTime(string current, string correct) {
        int count=0;
        
        int currMin=stoi(current.substr(0,2))*60+stoi(current.substr(3));
        int corrMin=stoi(correct.substr(0,2))*60+stoi(correct.substr(3));
        
        int diffMin=corrMin-currMin;
        
        while(diffMin>0)
        {
            if(diffMin>=60)
            {
                diffMin-=60;
            }
            else if(diffMin>=15)
            {
                diffMin-=15;
            }
            else if(diffMin>=5)
            {
                diffMin-=5;
            }
            else
            {
                diffMin-=1;
            }
            count++;
        }
        return count;
    }
};