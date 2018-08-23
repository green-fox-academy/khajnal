import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class SumTest {
  Numbers listToSum;

  @Before
  public void createASumList() {
    listToSum = new Numbers();
  }

  @Test
  public void checkIfElementAdded() {
    listToSum.addToList(4);
    assertEquals(1, listToSum.sizeOfList());
  }

  @Test
  public void sumTestWithEmptyList() {
    assertEquals(0, listToSum.sum());
  }

  @Test
  public void sumTestWithFourElement() {
    listToSum.addToList(4);
    listToSum.addToList(8);
    listToSum.addToList(9);
    listToSum.addToList(15);
    assertEquals(36, listToSum.sum());
  }

  @Test
  public void sumTestWithOneElement() {
    listToSum.addToList(4);
    assertEquals(4, listToSum.sum());
  }
}