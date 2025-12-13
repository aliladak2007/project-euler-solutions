package com.projecteuler.solutions;

public final class Problem071{
    /*
     * The aim is to find the fraction immediately less than 3/7
     * where the denominator is at most 1,000,000.
     *
     * We do this by checking every possible denominator d from 1 up to the limit.
     * For each denominator, we want the largest integer numerator n such that:
     *
     *     n / d < 3 / 7
     *
     * Using integer division, n = floor(3d / 7) gives the largest possible value
     * that does not exceed 3/7.
     *
     * If d is a multiple of 7, then floor(3d / 7) gives exactly 3/7,
     * which we must avoid. In this case, we subtract 1 from n to ensure
     * the fraction stays strictly less than 3/7.
     *
     * For denominators that are not multiples of 7, floor(3d / 7)
     * already satisfies the condition.
     *
     * Some fractions n/d may not be in lowest terms. However, we do not
     * need to explicitly reduce them.
     *
     * We process denominators in increasing order and keep track of the
     * largest fraction found so far. If a fraction is not in lowest terms,
     * its reduced form would have appeared earlier with a smaller denominator.
     * Since the value would be equal, it would not replace the current maximum.
     *
     * This guarantees that the final result is already in simplest form
     * without performing any gcd calculations.
     */

    private static final int LIMIT = 1_000_000;

    public String run() {
        int maxN = 0;
        int maxD = 1;

        for (int d = 1; d <= LIMIT; d++) {
            int n = d * 3 / 7;

            if (d % 7 == 0) {
                n--;
            }

            // Compare n/d with the current maximum maxN/maxD using cross multiplication
            if ((long) n * maxD > (long) maxN * d) {
                maxN = n;
                maxD = d;
            }
        }

        return Integer.toString(maxN);
    }

    public static void main(String[] args) {
        System.out.println(new Problem071().run());
    }
}

