public class F35 extends Aircraft{

  public F35() {
    super.maxAmmo = 12;
    super.baseDamage = 50;
  }

  public int refill(int ammoToFill) {
    int remainingAmmo = ammoToFill - (maxAmmo - ammo);
    if (maxAmmo != ammo) {
      int ammobase = ammo;
      for (int i = 0; i < maxAmmo - ammobase; i++) {
        ammo++;
      }
    }
    return remainingAmmo;
  }

  public String getType() {
    return "F35";
  }

  public String getStatus() {
    return "Type " + getType() + " Ammo: " + ammo + ", Base damage: " + baseDamage + ", All Damage " + allDamage;
  }

  public boolean isPriority() {
    return true;
  }
}
