import static org.junit.Assert.*;

public class AnagramTest {
  Anagram list = new Anagram();

  public void testAddTwoStringToAList() {
    list.addTwoStringToAList("One", "Two");
    assertEquals(2, list.sizeOfList());
  }
}