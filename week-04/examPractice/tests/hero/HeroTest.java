package hero;

import org.junit.Test;

import static org.junit.Assert.*;

public class HeroTest {
  DCHero john = new DCHero("John", 50);
  MarvelHero doe = new MarvelHero("Doe", 40);
  DCHero jane = new DCHero("Jane", 20);
  MarvelHero cate = new MarvelHero("Cate", 0);

  @Test
  public void getMotivationTestWithPunchInSameUniverseDC() {
    jane.punch(john);
    assertEquals(50, john.getMotivation(), 0.001);
  }

  @Test
  public void getMotivationTestWithPunchInSameUniverseMarvel() {
    doe.punch(cate);
    assertEquals(0, cate.getMotivation(), 0.001);
  }

  @Test
  public void toStringTestWithZeroMotivationLvL() {
    assertEquals("Cate is not motivated anymore.", cate.toString());
  }
}