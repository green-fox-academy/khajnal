import org.junit.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static org.junit.Assert.*;

public class UniqueCharsTest {

  @Test
  public  void uniqueCharacterTestIfNoUniqueChar() {
    String test = "blabla";
    List<String> empty = new ArrayList<>();
    assertEquals(empty,UniqueChars.uniqueCharacters(test));
  }

  @Test
  public  void uniqueCharacterTestIfThereIsUniqueChar() {
    String test = "apple";
    List<String> testUnique = new ArrayList<>();
    testUnique.add("a");
    testUnique.add("l");
    testUnique.add("e");
    boolean isUnique = false;
    for (int i = 0; i < testUnique.size(); i++) {
      if (UniqueChars.uniqueCharacters(test).contains(testUnique.get(i))) {
        isUnique = true;
      }
    }
    assertTrue(isUnique);
  }

  @Test
  public  void uniqueCharacterTestIfOnlyUniqueCharacter() {
    String test = "zsiraf";
    List<String> testUnique = new ArrayList<>();
    appleUnique.add("a");
    appleUnique.add("l");
    appleUnique.add("e");
    boolean isUnique = false;
    for (int i = 0; i < appleUnique.size(); i++) {
      if (UniqueChars.uniqueCharacters(test).contains(appleUnique.get(i))) {
        isUnique = true;
      }
    }
    assertTrue(isUnique);
  }
//
//  @Test
//
//  @Test
}