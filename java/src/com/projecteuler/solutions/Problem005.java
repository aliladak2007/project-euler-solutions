package com.projecteuler.solutions;

import java.math.BigInteger;

public class Problem005 {
    /**
     * 2520 is the smallest number that can be divided by each of the numbers from
     * 1 to 10 without any remainder.
     * What is the smallest positive number that is evenly divisible by all the
     * numbers from 1 to 20?
     */
    private static BigInteger lcm(BigInteger a, BigInteger b){
        return a.divide(a.gcd(b)).multiply(b);
    }

    public String run() {
        BigInteger allLcm = BigInteger.ONE;
        for (int i = 1; i <= 20;  i++) {
            allLcm = lcm(BigInteger.valueOf(i), allLcm);
        }
        return allLcm.toString();
    }

    public static void main(String[] args) {
        System.out.println(new Problem005().run());
    }
}
