import java.util.*;

public class Candyshop {
    public static void main(String... args){
      ArrayList<Object> arrayList = new ArrayList<Object>();
      arrayList.add("Cupcake");
      arrayList.add(2);
      arrayList.add("Brownie");
      arrayList.add(false);
//      Your task is to change from "2" to "Croissant" and change from "false" to "Ice cream"
      System.out.println(sweets(arrayList));
    }
    public static ArrayList<Object> sweets(ArrayList<Object> example) {
      example.set(1, "Croissant");
      example.set(3, "Ice cream");
      return example;
    }
  }
