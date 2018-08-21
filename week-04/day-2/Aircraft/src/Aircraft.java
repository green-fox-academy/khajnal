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

  public String getType() {
    return " ";
  }

  public String getStatus() {
    return " ";
  }

  public boolean isPriority() {
    return true;
  }


  public int refill(int ammoToFill) {
    int neededAmmo = maxAmmo - ammo;
    if (maxAmmo != ammo) {
      if (ammoToFill >= neededAmmo) {
        ammo = maxAmmo;
        ammoToFill -= neededAmmo;
      } else {
        ammo += ammoToFill;
        ammoToFill = 0;
      }
    } return ammoToFill;
  }
}