import java.util.Arrays;

public class Playing {
  public static void main(String[] args) {
    String play = "I am just playing and";
    String newString = play.concat(" learning.");
    System.out.println(newString);
    String playUppercase = "I AM JUST PLAYING AND";
    System.out.println(play.compareToIgnoreCase(playUppercase));

    String lowerCase = play.toLowerCase();
    System.out.println(lowerCase);

    System.out.println(newString.equalsIgnoreCase("salala"));
    System.out.println(play.equalsIgnoreCase(playUppercase));

    String[] abracadabra = playUppercase.split("");
    System.out.println(Arrays.toString(abracadabra));

    String original = "I am singing.";
    String replaced = original.replace("singing", "learning");
    System.out.println(replaced);

    if(original.startsWith("I")) {
      System.out.println("yepp");
    } else {
      System.out.println("nope");
    }
    System.out.println(original.indexOf('g'));
    System.out.println(original.lastIndexOf('g'));
  }
}