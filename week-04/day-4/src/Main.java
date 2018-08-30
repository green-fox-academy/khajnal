public class Main {
  public static void main(String[] args) {
    Anagram anagram = new Anagram();
    anagram.addTwoStringToAList("kutya", "kaja");
    System.out.println(anagram.ifAnagrams());

    Anagram anagramOne = new Anagram();
    anagramOne.addTwoStringToAList("kutya", "tyauk");
    System.out.println(anagramOne.ifAnagrams());

    Anagram anagramTwo = new Anagram();
    anagramTwo.addTwoStringToAList("Kutya", "tyauk");
    System.out.println(anagramTwo.ifAnagrams());
  }
}
