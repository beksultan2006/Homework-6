public class Boss extends GameEnitity {

   private String superpower;
   private int health;
   private int damage;

   public String getSuperpower() {
      return superpower;
   }

   public void setSuperpower(String superpower) {
      this.superpower = superpower;
   }

   @Override
   public int getHealth() {
      return health;
   }

   @Override
   public void setHealth(int health) {
      this.health = health;
   }

   @Override
   public int getDamage() {
      return damage;
   }

   @Override
   public void setDamage(int damage) {
      this.damage = damage;
   }

}
