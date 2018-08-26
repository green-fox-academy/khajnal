import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class CABTest {
  CAB listOfNumbers;

  @Before
  public void createCab() {
    listOfNumbers = new CAB();
  }

  @Test
  public void createFourDigitNumberTest() {
    listOfNumbers.createFourDigitNumber();
    assertEquals(4, listOfNumbers.nrOfDigits());
  }

  @Test
  public void uniqueDigitNumberTest() {
    listOfNumbers.uniqueFourDigitNumber();
    assertEquals(4, listOfNumbers.nrOfDigits());
    assertTrue(listOfNumbers.isUnique());
    }

    @Test
  public void getUserGuessTest() {
    listOfNumbers.getUserGuess();
    assertTrue();
    }
  }