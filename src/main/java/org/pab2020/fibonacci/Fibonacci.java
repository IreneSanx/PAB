package org.pab2020.fibonacci;
/**
 * Class to resolve the Fibonacci problem
 *
 * @author Irene Sanchez
 */
public class Fibonacci {
    public long compute(long n, long k) throws RuntimeException {
        long result = 0;
        if ((n > 40) || (k > 5)) {
            throw new RuntimeException("Out of range");
        }
        else{
            if ((n == 1) || (n==2)){
                result = 1;
            }
            else{
                result = compute(n-1,k) + compute(n-2,k)*k;
            }
        }
        return result;
    }
}
