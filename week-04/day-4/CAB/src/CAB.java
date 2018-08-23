import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.Scanner;

public class CAB {
  private List<Integer> nrToGuess = new ArrayList<>();
  private String userGuess;

  public List<Integer> createFourDigitNumber() {
    Random random = new Random();
    nrToGuess.add(random.nextInt(9) + 1);
    nrToGuess.add(random.nextInt(9) + 1);
    nrToGuess.add(random.nextInt(9) + 1);
    nrToGuess.add(random.nextInt(9) + 1);
    return nrToGuess;
  }

  public int nrOfDigits() {
    return nrToGuess.size();
  }

  public List<Integer> uniqueFourDigitNumber() {
    Random random = new Random();
    int randomNumber;

    while (nrToGuess.size() < 4) {
      randomNumber = random.nextInt(9) + 1;
      if (!nrToGuess.contains(randomNumber)) {
        nrToGuess.add(randomNumber);
      }
    }
    return nrToGuess;
  }

  public Integer getValue(int index) {
    return nrToGuess.get(index);
  }

  public boolean isUnique() {
    for (int i = 0; i < nrToGuess.size(); i++) {
      for (int j = i + 1; j < nrToGuess.size(); j++)
        if (nrToGuess.get(i) == nrToGuess.get(j)) {
          return false;
        }
    }
    return true;
  }

  public String getUserGuess() {
    Scanner scanner = new Scanner(System.in);
    System.out.println("Please enter your 4 digit number guess!");
    int temp = scanner.nextInt();
    return this.userGuess = Integer.toString(temp);
  }

  public boolean userGuessIsString() {
    if ()
  }
}
