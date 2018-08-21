public class F35 extends Aircraft{

  public F35() {
    super.maxAmmo = 12;
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
}
