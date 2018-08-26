package battle;

import hero.BaseHero;
import hero.DCHero;
import hero.MarvelHero;
import hero.Punchable;

import java.util.Arrays;
import java.util.List;

public class HeroBattle {

  public static void main(String[] args) {

    /*********************************************************
     *  Do not modify the code below except for test purpose *
     *********************************************************/
    List<BaseHero> heroes = Arrays.asList(
        new MarvelHero("Hulk", 55),
        new MarvelHero("Iron man", 35),
        new MarvelHero("Daredevil"),
        new DCHero("Batman", 60),
        new DCHero("Superman", 25),
        new DCHero("Wonder woman")
    );

    battle(heroes);

    log(heroes);

  }

  private static void battle(List<BaseHero> heroes) {
    while (anyHeroCanFight(heroes)) {
      for (BaseHero hero : heroes) {
        punchOtherHeroes(hero, heroes);
      }
    }
  }

  private static void log(List<BaseHero> heroes) {
    for (BaseHero hero : heroes) {
      System.out.println(hero);
    }
  }

  private static boolean anyHeroCanFight(List<BaseHero> heroes) {
    for (BaseHero hero : heroes) {
      if (hero.getMotivationLevel() > 1) {
        return true;
      }
    }
    return false;
  }

  private static void punchOtherHeroes(BaseHero hero, List<BaseHero> otherHeroes) {
    for (BaseHero otherHero : otherHeroes) {
      if (otherHero != hero && otherHero instanceof Punchable) {
        hero.punch((Punchable) otherHero);
      }
    }
  }
}