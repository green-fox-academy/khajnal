import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Main {
  public static void main(String[] args) {
    Sharpie blue = new Sharpie("blue", 2);
    Sharpie black = new Sharpie("black", 2);
    Sharpie red = new Sharpie("red", 2);
    red.use();

    SharpieSet sharpies = new SharpieSet();
    sharpies.addSharpie(black);
    sharpies.addSharpie(blue);
    sharpies.addSharpie(red);

    sharpies.checkSharpies();
    sharpies.removeTrash();
    sharpies.checkSharpies();
    System.out.println(sharpies.countUsable());
  }
}
