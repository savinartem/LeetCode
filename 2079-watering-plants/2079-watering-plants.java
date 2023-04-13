class Solution {
    public int wateringPlants(int[] plants, int capacity) {
        int steps=0;
        int temp=capacity;
        
        for(int i=0; i<plants.length; i++)
        {
            if(capacity-plants[i]>=0)
            {
                steps++;
                capacity-=plants[i];
            }
            else
            {
                steps+=i;
                capacity=temp;
                steps+=i+1;
                capacity-=plants[i];
            }
        }
        return steps;
    }
}