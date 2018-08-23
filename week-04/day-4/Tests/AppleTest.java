
import org.junit.Test;

import static org.junit.Assert.*;

public class AppleTest {
  @Test
  public void testGetApple() {
    Apple apple = new Apple();
    assertEquals("apple", apple.getApple());
  }
}