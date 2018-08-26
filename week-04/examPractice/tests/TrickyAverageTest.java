import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class TrickyAverageTest {
  /**
   * Write your test cases here. You should be able to invoke the method like this:
   * double result = TrickyAverage.getTrickyAvg(input);
   */

  @Test
  public void getTrickyAvg_testWithBiggerThanZero() {
    int[] example = {3, 5, 7, 10};
    assertEquals((double) (3 + 10) / 2, TrickyAverage.getTrickyAvg(example), 0.001);
  }

  @Test
  public void getTrickyAvg_testCase2() {
    int[] example = {-10, -5, 3, 10, 5};
    assertEquals((double) (-5 + 10) / 2, TrickyAverage.getTrickyAvg(example), 0.001);
  }
}