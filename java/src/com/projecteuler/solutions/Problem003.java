package com.projecteuler.solutions;

public class Problem003 {
    /*
     * By the fundamental theorem of arithmetic, every integer n > 1 has a single
     * unique factorisation into prime numbers.
     * In symbols, n = p0 * p1 * ... * p{m-1}, where each p_i > 1 is prime, with
     * repetition allowed.
     * If we repeatedly divide n by its smallest prime factor, the final factor we
     * remove is the largest prime factor of n.
     * For example, 600851475143 = 71 * 839 * 1471 * 6857.
     */

    private static long smallestFactor(long n) {
        if (n <= 1)
            throw new IllegalArgumentException();
        for (long i = 2, end = (long) Math.sqrt(n); i <= end; i++) {
            if (n % i == 0) {
                return i;
            }
        }
        return n;
    }

    /**
     * The prime factors of 13195 are 5, 7, 13 and 29.
     * What is the largest prime factor of the number 600851475143?
     */
    public String run() {
        long n = 600851475143L;
        while (true) {
            long p = smallestFactor(n);
            if (p < n)
                n /= p;
            else
                return Long.toString(n);
        }
    }

    public static void main(String[] args) {
        System.out.println(new Problem003().run());
    }
}
