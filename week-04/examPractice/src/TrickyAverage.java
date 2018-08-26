public class TrickyAverage {
  public static void main(String[] args) {
    int[] array = {5, 2, 8, -1};
    System.out.println(getTrickyAvg(array));
  }

  public static double getTrickyAvg(int[] array) {
    double smallestOdd = 0;
    double largestEven = 0;
    for (int i = 0; i < array.length ; i++) {
      if (array[i] % 2 != 0) {
        smallestOdd = array[i];
        break;
      }
    }
    for (int i = 0; i < array.length ; i++) {
      if (array[i] % 2 == 0) {
        largestEven = array[i];
        break;
      }
    }
    for (int i = 1; i < array.length; i++) {
      if (array[i] % 2 == 0 && array[i] > largestEven)
        largestEven = array[i];
      else if (array[i] % 2 != 0 && array[i] < smallestOdd)
        smallestOdd = array[i];
    }
    return (largestEven + smallestOdd) / 2;
  }
}