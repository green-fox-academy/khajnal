package main.java.music;

public class BassGuitar extends StringedInstrument {
  private String sound;

  public BassGuitar() {
    super("Bass Guitar", 4);
    this.sound = "Duum-duum-duum";
  }

  public BassGuitar(int numberOfStrings) {
    super("Bass Guitar", numberOfStrings);
    this.sound = "Duum-duum-duum";
  }

  @Override
  void sound() {
    System.out.println(name + ", a " + numberOfStrings + " stringed instrument that goes " + sound);
  }
}