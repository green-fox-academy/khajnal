public class String3 {
  public static void main(String[] args) {
    String text = "Let's separate this text with stars, because stars are cool";
    System.out.println(separateWithStars(text));
  }
  private static String separateWithStars(String text) {
    if (text.length() == 0) {
      return text;
    } else  {
     return text.charAt(0) + "*" + separateWithStars(text.substring(1));
    }
  }
}
