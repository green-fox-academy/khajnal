public class Main {
  public static void main(String[] args) {
    // You have a `DiceSet` class which has a list for 6 dices
// You can roll all of them with roll()
// Check the current rolled numbers with getCurrent()
// You can reroll with reroll()
// Your task is to roll the dices until all of the dices are 6
      DiceSet diceSet = new DiceSet();
      diceSet.getCurrent();
      diceSet.roll();
      diceSet.getCurrent();
      diceSet.getCurrent(5);
      diceSet.reroll();
      diceSet.getCurrent();
      diceSet.reroll(4);
      diceSet.getCurrent();
    }

}
