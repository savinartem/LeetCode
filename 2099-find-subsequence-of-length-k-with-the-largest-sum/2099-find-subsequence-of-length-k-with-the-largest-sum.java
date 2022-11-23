class Solution {
    public int[] maxSubsequence(int[] nums, int k) {
        int[] temp = new int[nums.length];
        int[] result = new int[k];
        temp = nums.clone();
        Arrays.sort(temp);
        Map<Integer, Integer> map = new HashMap<Integer, Integer>();
        for(int i = temp.length-1; i > temp.length-1-k; i--)
        {
            if(!map.containsKey(temp[i]))
                map.put(temp[i], 1);
            else
                map.compute(temp[i], (key, v) -> v+=1);
        }
        int i = 0;
        for(int num: nums)
        {
            if(map.containsKey(num) && map.get(num) > 0)
            {
                result[i] = num;
                map.compute(num, (key, v) -> v-=1);
                i++;
            }
        }
        return result;
    }
}