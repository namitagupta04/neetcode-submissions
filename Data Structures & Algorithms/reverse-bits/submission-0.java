class Solution {
    public int reverseBits(int n) {

        int ans = 0;

        for (int i = 0; i < 32; i++) {

            int bit = n & 1;        // get last bit

            ans = (ans << 1) | bit; // put bit into reversed position

            n = n >>> 1;            // move to next bit
        }

        return ans;
    }
}