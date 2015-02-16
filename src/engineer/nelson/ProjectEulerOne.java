/**
 * Project Euler One:  Finds the sum of all the multiples of 3 or 5 below 1000.
 *
 * @author Mark Nelson
 * @since 5.0
 *
 * @see https://projecteuler.net
 */

// Copyright (c) 2015.  Mark Nelson.  All rights reserved.

package engineer.nelson;

/**
 * Project Euler One:  Finds the sum of all the multiples of 3 or 5 below 1000.
 *
 */
public class ProjectEulerOne {

  /**
   * Compute the sum of all multiples of 3 or 5 below 1000.
   *
   * This method is declared statically because it does not interact with any other variables.  It's truly standalone.
   *
   * @return The sum of all the multiples of 3 or 5 below 1000.
   */
  public static int computeEulerOne() {
    int iRuningEulerOne = 0;            // Track the running balance

    for (int i = 3; i < 1000; i++) {
      if (i % 3 == 0 || i % 5 == 0) {
        /* System.out.println( i ); */  // For debugging
        iRuningEulerOne += i;
      }
    }

    return iRuningEulerOne;
  }

  /**
   * Application entry point.
   *
   * @param args Command line arguments -- unused.
   */
  public static void main(String[] args) {

    int iEulerOne = computeEulerOne();

    System.out.println(iEulerOne);

  }
}
