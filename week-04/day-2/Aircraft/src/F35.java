public class F35 extends Aircraft{

  public F35() {
    super.maxAmmo = 12;
    super.baseDamage = 50;
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
