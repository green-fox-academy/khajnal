import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class SumTest {
  Numbers toSum;

  @Before
  public void createASumList() {
    toSum = new Numbers();
  }

  @Test
  public void checkIfElementAdded() {
    toSum.addToList(4);
    assertEquals(1, toSum.sizeOfList());
  }

  @Test
  public void sumTestWithEmptyList() {
    assertEquals(0, toSum.sizeOfList());

  }

  @Test
  public void sumTestWithFourElement() {
  }

}