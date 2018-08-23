import org.junit.Before;

import static org.junit.Assert.*;

public class AnagramTest {
  Anagram list;

  @Before
  public void createASumList() {
    list = new Anagram();
  }

  public void testAddTwoStringToAList() {
    list.addTwoStringToAList("One", "Two");
    assertEquals(2, list.sizeOfList());
  }

  public void testIfAnagrams() {
    list.addTwoStringToAList("kutyakaja", "kajakutya");
    assertEquals(true,list.ifAnagrams(list));
  }
}