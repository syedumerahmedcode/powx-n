public class Solution {

    public double myPow(double x, int n) {
        // edge case
        if (n == 0) {
            return 1;
        }
        // convert n to long to handle edge case when n==Integer.min_value
        long N = n;

        //If n is negative, we need to handle reciprocal of x
        if (N < 0) {
            x = 1 / x;
            N = -N;
        }
        double result = 1;
        double currentProduct = x;

        // Exponentiation by sqauring
        while (N > 0) {
            if (N % 2 == 1) {
            //Incase n is an odd number
                result *= currentProduct;
            }
            // square the base
            currentProduct *= currentProduct;
            // divide the exponent by 2
            N /= 2;
        }
        return result;
    }
}
