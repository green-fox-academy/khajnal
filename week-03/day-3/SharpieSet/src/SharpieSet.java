import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class SharpieSet {
  List<Sharpie> sharpieList = new ArrayList<>();

  public SharpieSet() {
  }

  public void addSharpie(Sharpie blue) {
    sharpieList.add(blue);
  }

  public int countUsable() {
    int usable = 0;
    for (int i = 0; i < sharpieList.size(); i++) {
      if (sharpieList.get(i).inkAmount > 0) {
        usable++;
      }
    }
    return usable;
  }

  public void checkSharpies() {
    for (int i = 0; i < sharpieList.size(); i++) {
      System.out.println(sharpieList.get(i).inkAmount + " " + sharpieList.get(i).color);
    }
  }

  public void removeTrash() {
    for (int i = 0; i < sharpieList.size(); i++) {
      if (sharpieList.get(i).inkAmount == 0) {
        sharpieList.remove(i);
      }
    }
  }
}
