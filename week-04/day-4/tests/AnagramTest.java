import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class AnagramTest {
  Anagram list;

  @Before
  public void createASumList() {
    list = new Anagram();
  }

  @Test
  public void testAddTwoStringToAList() {
    list.addTwoStringToAList("One", "Two");
    assertEquals(2, list.sizeOfList());
  }

  @Test
  public void testIfAnagrams() {
    list.addTwoStringToAList("kutyakaja", "kajakutya");
    assertEquals(true,list.ifAnagrams(list));
  }
}