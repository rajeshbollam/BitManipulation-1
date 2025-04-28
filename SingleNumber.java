//The idea here is to use XOR operation on all the elements in the array to get the unique number
//Time Complexity: O(n)
//Space Complexity: O(1)
class Solution {
    public int singleNumber(int[] nums) {
        int result = 0;
        for(int i = 0; i<nums.length; i++){
            result = result^nums[i];
        }
        return result;
    }
}