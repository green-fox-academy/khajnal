public class VariableMutation {
  public static void main(String[] args) {
    int a = 3;
    a += 10;
    System.out.println(a);

    int b = 100;
    b -= 7;
    System.out.println(b);

    int c = 44;
    c *= 2;
    System.out.println(c);

    int d = 125;
    d /= 5;
    System.out.println(d);

    int e = 8;
    e *= e *= e;
    System.out.println(e);

    int f1 = 123;
    int f2 = 345;
    boolean result1 = f1 > f2;
    System.out.println(result1);

    int g1 = 350;
    int g2 = 200;
    boolean result2 = g2 * g2 > g1;
    System.out.println(result2);

    int h = 135798745;
    boolean result3 = h % 11 == 0;
    System.out.println(result3);

    int i1 = 10;
    int i2 = 3;
    boolean result4 = i1 > Math.pow(i2, 2) && i1 < Math.pow(i2, 3);
    System.out.println(result4);

    int j = 1521;
    boolean result5 = j % 3 == 0 || j % 5 == 0;
    System.out.println(result5);

    String k = "Apple";
    k = k + k + k + k;
    System.out.println(k);
  }
}
