public class ArmstrongNumber {
  public static void main(String[] args) {
//    isArmstrongNumber(1634);
//    isArmstrongNumber(1);
//    isArmstrongNumber(800);
    System.out.println(countDigits(1634));
    System.out.println(countDigits(1));
    System.out.println(countDigits(800));
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

  }
}

//
//  An Armstrong number is an n-digit number that is equal to the sum of the nth powers of its digits.
//
//    Let's demonstrate this for a 4-digit number: 1634 is a 4-digit number, raise each digit to the fourth power, and add: 1^4 + 6^4 + 3^4 + 4^4 = 1634, so it is an Armstrong number.
//    For a 3-digit number: 153 is a 3-digit number, raise each digit to the third power, and add: 1^3 + 5^3 + 3^3 = 153, so it is an Armstrong number.
//    Exercise
//    Write a simple program to check if a given number is an armstrong number. The program should ask for a number. E.g. if we type 371, the program should print out: The 371 is an Armstrong number.
