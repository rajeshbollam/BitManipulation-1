//The idea here is to left shift by divisor until we are left with remainder and 2 power of that shifts will be result if remainder is less that divisor
//If the remainder is more than the divisor, then we should continue the process
//Time Complexity: O(log(n)) where n is the quotient
//Space Compelxity: O(1)
class Solution {
    public int divide(int dividend, int divisor) {
        int result = 0;
        if(dividend == Integer.MIN_VALUE && divisor == -1) return Integer.MAX_VALUE;
        long ldividend = Math.abs((long)(dividend));
        long ldivisor = Math.abs((long)(divisor));
        while(ldividend >= ldivisor){
            int shifts = 0;
            while(ldividend >= (ldivisor << shifts)){
                shifts++;
            }
            shifts--;
            result += (1 << shifts); //adding result to 2 raised to power of shifts
            ldividend = ldividend - (ldivisor << shifts);
        }
        if((dividend > 0 && divisor > 0) || (dividend < 0 && divisor < 0)) return result;
        return -result;
    }
}