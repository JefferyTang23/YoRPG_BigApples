public class Character {
  private int health;
  private int strength;
  private int defense;
  private double ar;

  public boolean isAlive() {
    return (hp > 0);
  }

  public int getDefense() {
    return defense; 
  }

  public void lowerHP(int damage) {
    hp -= damage; 
  }

  public int attack(Character character) {
    int damage = (int)((strength * ar) - character.getDefense());
    if (damage > 0) {
      character.lowerHP(damage);
    } else {
      damage = 0;
    }
    return damage;
  }
}
