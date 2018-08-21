public class Aircraft {
  int ammo;
  int maxAmmo;
  int baseDamage;

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
}