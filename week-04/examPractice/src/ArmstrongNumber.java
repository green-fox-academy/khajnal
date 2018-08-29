public class ArmstrongNumber {
  public static void main(String[] args) {
    System.out.println(isArmstrongNumber(1634));
    System.out.println(isArmstrongNumber(153));
    System.out.println(isArmstrongNumber(1));
    System.out.println(isArmstrongNumber(800));
  }

  public static String[] digitArray(int number) {
    String numberString = String.valueOf(number);
    String[] numberSplitted = numberString.split("");
    return numberSplitted;
  }

  public static int countDigits(int number) {
    String[] numberSplitted = digitArray(number);
    int nrOfDigits = 0;
    for (int i = 0; i < numberSplitted.length ; i++) {
      nrOfDigits += 1;
    }
    return nrOfDigits;
  }

  public static boolean isArmstrongNumber(int number) {
    int nrOfDigits = countDigits(number);
    String[] numberSplitted = digitArray(number);
    int multipliedNumbers = 0;
    for (int i = 0; i < numberSplitted.length ; i++) {
      multipliedNumbers += (int)Math.pow(Integer.valueOf(numberSplitted[i]), nrOfDigits);
    }
    if (number == multipliedNumbers) {
      return true;
    }
    return false;
  }
}