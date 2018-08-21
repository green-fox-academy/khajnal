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
    int remainingAmmo = ammoToFill - (maxAmmo - ammo);
    if (maxAmmo != ammo) {
      int ammobase = ammo;
      if (ammoToFill - ammo > 0) {
        for (int i = 0; i < maxAmmo - ammobase; i++) {
          ammo++;
        }
      } else {
        for (int i = 0; i < maxAmmo - ammobase; i++) {
          ammo++;
        }
      }
    } return remainingAmmo;
  }
}