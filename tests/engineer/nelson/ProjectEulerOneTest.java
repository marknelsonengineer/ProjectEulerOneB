/**
 * Project Euler One:  Test finding the sum of all the multiples of 3 or 5 below 1000.
 *
 * @author Mark Nelson
 * @since 5.0
 *
 * @see https://projecteuler.net
 */

// Copyright (c) 2015.  Mark Nelson.  All rights reserved.

package engineer.nelson;

import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Test harness for ProjectEulerOne.
 */
public class ProjectEulerOneTest {

  /**
   * Positive test for this Euler One project.
   *
   * @throws Exception
   */
  @Test
  public void testComputeEulerOne() throws Exception {
    assertEquals( "Euler One expected result", 233168, ProjectEulerOne.computeEulerOne());
  }

  /**
   * Lower-bound test for this Euler One project.
   *
   * @throws Exception
   */
  @Test
  public void testComputeEulerOneLowerBound() throws Exception {
    assertNotEquals("Euler One lower bound", 233167, ProjectEulerOne.computeEulerOne());
  }

  /**
   * Upper-bound test for this Euler One project.
   *
   * @throws Exception
   */
  @Test
  public void testComputeEulerOneUpperBound() throws Exception {
    assertNotEquals( "Euler One upper bound", 233169, ProjectEulerOne.computeEulerOne());
  }
}