//The idea here is to use the lsb value to find one of the unique numbers
//The approach is first finding the bitmask where we get the xor value of two unique numbers, then we find one unique number by performing AND with lsb which filters the one which gives value 1, others give value 0
//Then we perform xor of unique number with result to get other unique number
//Time Complexity: O(n)
//Space Complexity: O(1)
class Solution {
    public int[] singleNumber(int[] nums) {
        int bitmask = 0;
        for(int num: nums){
            bitmask = bitmask ^ num;
        }
        //bitmask = x+y
        int lsb = bitmask & (-bitmask); //gives LSB of x+y
        int bitmask2 = 0;
        for(int num: nums){
            if((num & lsb) != 0){
                bitmask2 ^= num;
            }
        }
        return new int[]{bitmask2, bitmask^bitmask2};
    }
}