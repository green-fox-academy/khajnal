public class SubStrList {
  public static void main(String[] args) {
    String[] searchArr = new String[] {"this", "is", "what", "I'm", "searching"};
    System.out.println(subStrList("ching", searchArr));
    //  should print: `4`
    System.out.println(subStrList("not", searchArr));
    //  should print: `-1`
  }

  private static int subStrList(String text, String[] searchArr) {
    for (int i = 0; i < searchArr.length; i++) {
      if (searchArr[i].contains(text)) {
        return i;
      }
    }
    return -1;
  }
}