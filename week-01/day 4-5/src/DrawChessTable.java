public class DrawChessTable {
  public static void main(String[] args) {
    for (int a = 1; a < 9; a++) {
      if (a % 2 == 0) {
        System.out.println(" " + new String(new char[4]).replace("\0","%"));
      } else {
        System.out.println(new String(new char[4]).replace("\0","%"));
      }
    }
  }
}
