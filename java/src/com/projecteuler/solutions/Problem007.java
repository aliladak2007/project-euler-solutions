package com.projecteuler.solutions;

public class Problem007 {
    /*
     * Computers are fast, so we can implement this solution by testing each number
     * individually for primeness, instead of using the more efficient sieve of Eratosthenes.
     */
    // Returns floor(sqrt(x)), for x >= 0.
    public static int sqrt(int x) {
        if (x < 0)
            throw new IllegalArgumentException("Square root of negative number");
        int y = 0;
        for (int i = 1 << 15; i != 0; i >>>= 1) {
            y |= i;
            if (y > 46340 || y * y > x)
                y ^= i;
        }
        return y;
    }

    // Tests whether the given non-negative integer is prime.
    public static boolean isPrime(int x) {
        if (x < 0)
            throw new IllegalArgumentException("Negative number");
        if (x == 0 || x == 1)
            return false;
        else if (x == 2)
            return true;
        else {
            if (x % 2 == 0)
                return false;
            for (int i = 3, end = sqrt(x); i <= end; i += 2) {
                if (x % i == 0)
                    return false;
            }
            return true;
        }
    }
    public String run() {
        for (int i = 2, count = 0; ; i++) {
            if (isPrime(i)) {
                count++;
                if (count == 10001)
                    return Integer.toString(i);
            }
        }
    }

    public static void main(String[] args) {
        System.out.println(new Problem007().run());
    }
}
