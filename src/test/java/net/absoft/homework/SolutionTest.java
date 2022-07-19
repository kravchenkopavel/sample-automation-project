package net.absoft.homework;

import org.testng.Assert;
import org.testng.annotations.Test;

public class SolutionTest {

  @Test
  public void testDMoreThanZero() {
    Solution solution = Solution.getSolution(1, -4, -5);
    Assert.assertNotNull(solution, "Solution is null");
    double X1 = solution.getX1();
    double X2 = solution.getX2();
    Assert.assertNotEquals(X1, X2, "Solutions must be different");
  }

  @Test
  public void testDEqualsZero() {
    Solution solution = Solution.getSolution(1, 2, 1);
    Assert.assertNotNull(solution, "Solution is null");
    double X1 = solution.getX1();
    double X2 = solution.getX2();
    Assert.assertEquals(X2, X1, "Solutions must be the same");
  }

  @Test
  public void testDLessThanZero() {
    Object solution = Solution.getSolution(3, -4, 2);
    Assert.assertNull(solution, "Solution must be null");
  }

}
