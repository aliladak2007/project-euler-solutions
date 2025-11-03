package com.projecteuler.solutions;

public class Problem004 {
    /**
     * A palindromic number reads the same both ways. The largest palindrome made from
     * the product of two 2-digit numbers is
     * 9009 = 91 x 99.
     * Find the largest palindrome made from the product of two 3-digit numbers.
     */
    public boolean isPalindrome(String s) {
        return s.equals(new StringBuilder(s).reverse().toString());
    }
    public String run() {
        int maxPalin = -1;
        for (int i = 100; i < 1000; i++) {
            for (int j = 100; j < 1000; j++) {
                int prod = i * j;
                if (isPalindrome(String.valueOf(prod)) && prod > maxPalin) {
                    maxPalin = prod;
                }
            }
        }
        return Integer.toString(maxPalin);
    }

    public static void main(String[] args) {
        System.out.println(new Problem004().run());
    }
}
