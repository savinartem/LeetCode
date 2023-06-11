class Solution {
public:
    uint32_t reverseBits(uint32_t n) {
                int result=0;
        for(int i=0; i<32;i++){
            int curBit=(n>>i) & 1;
            result+=(curBit<<(31-i));
        }
        return result;
    }
};