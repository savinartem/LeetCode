class Solution {
    public int[] smallerNumbersThanCurrent(int[] nums) {
        HashMap<Integer, Integer> smaller= new HashMap<>();
        int n=nums.length;
        int[] result=new int[n];
        int[] copyArr= nums.clone();
        
        Arrays.sort(copyArr);
        
        for(int i=0; i<n; i++){
            if(!smaller.containsKey(copyArr[i])){
                smaller.put(copyArr[i],i);//using value as the key
            }
        }
        for(int i=0;i<n;i++){
            result[i]=smaller.get(nums[i]);
        }
        return result;
    }
}