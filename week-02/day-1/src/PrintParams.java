public class PrintParams {
  public static void main(String[] args) {
    printParams("first", "second", "third", "fourh");
  }
  public static void printParams(String...allElements){
    for ( String oneElement : allElements) {
      System.out.println(oneElement);
    }
  }
}
