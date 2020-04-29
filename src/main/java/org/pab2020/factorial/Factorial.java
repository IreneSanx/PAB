package org.pab2020.factorial;

/**
 * This class implements a method to compute the factorial of a integer number
 *
 */
public class Factorial 
{
    public long compute(long value) {
        long result;
        if (value < 0){
            throw new RuntimeException("Negative number: " + value);
        }
        else if ((value == 0) || (value == 1)) {
            result = 1;
        }
        else {
            //result = value * compute(value -1);
            result = 1;
            for(int i = 1; i <= value; i++){
                result = result * i;
            }
        }
        return result;
    }
}
