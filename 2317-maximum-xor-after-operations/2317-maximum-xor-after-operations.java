class Solution {
    public int maximumXOR(int[] nums) {
        int result=0;
        for(int i=0; i<nums.length;i++){
            result=result | nums[i];
        }
        return result;
    }
}
/*

Bit Manipulation.
Here we have A & (A ^ B), now if A = 9 (ie 1 0 0 1), now A & (A ^ B) can not be more than 9,
because we are anding A ^ B with A, so here we know that iff the bit is 1 it can be 0,
but we can not make 0 to 1.
therefore we need to just bitwise OR each number 
(it there is 1 at that bit in any number than we can get that 1 in ans, 
however iff there is 0 at that bit in all numbers than it will be 0).


*/