package net.absoft.mortalwombat;

import org.testng.Assert;
import org.testng.annotations.Test;

public class AgeCheckerTest {

  private final static AgeChecker ageChecker = new AgeChecker();

  @Test
  public void testAgedUserCanPlay() {
    Assert.assertTrue(ageChecker.canPlayGame(19), "Aged user can't play game");
  }

  @Test
  public void testThatTooYongUsersCanNotPlay() {
    Assert.assertFalse(ageChecker.canPlayGame(17), "User is too yong to play game");
  }
}
