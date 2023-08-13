/*
 * [43] Multiply Strings
 */

import java.math.BigInteger;

class Solution {
    public String multiply(String num1, String num2) {
        BigInteger numOne= new BigInteger(num1);
        BigInteger numTwo= new BigInteger(num2);
        return numOne.multiply(numTwo).toString();
    }
}