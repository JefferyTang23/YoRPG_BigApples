public class Character {
  public int health;
  public int strength;
  public int defense;
  public double ar;

  public boolean isAlive() {
    return (health > 0);
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
