import java.lang.reflect.Method;

public class Reverse {
  public static void main(String[] args) {
    String reversed1 = ".eslaf eb t'ndluow ecnetnes siht ,dehctiws erew eslaf dna eurt fo sgninaem eht fI";
    System.out.println(reverse(reversed1));
  }
  public static String reverse(String example) {
    String abc = "";
    for (int i = example.length() -1; i >= 0; i--) {
      abc += example.charAt(i);
    }
    return abc;
  }
}
