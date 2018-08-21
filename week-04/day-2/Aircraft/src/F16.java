public class F16 extends Aircraft {

  public F16() {
    super.maxAmmo = 8;
    super.baseDamage = 30;
  }

  public int refill(int ammoToFill) {
    int remainingAmmo = ammoToFill - (maxAmmo - ammo);
    if (maxAmmo != ammo) {
      for (int i = 0; i < maxAmmo - ammo; i++) {
        ammo++;
      }
    }
    return remainingAmmo;
  }

  public String getType() {
    return "F16";
  }

  public String getStatus() {
   return "Type " + getType() + " Ammo: " + ammo + ", Base damage: " + baseDamage + ", All Damage " + allDamage;
  }

  public boolean isPriority() {
    return false;
  }
}