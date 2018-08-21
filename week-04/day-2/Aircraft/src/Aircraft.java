public class Aircraft {
  int ammo;
  int maxAmmo;
  int baseDamage;
  int allDamage;

  public Aircraft() {
    ammo = 0;
  }

  public int fight() {
    return baseDamage * ammo;
  }

  public int refill(int ammoToFill) {
    int remainingAmmo = 0;
    return remainingAmmo;
  }

  public String getType() {
    return " ";
  }

  public String getStatus() {
    return " ";
  }

  public boolean isPriority() {
    return true;
  }
}