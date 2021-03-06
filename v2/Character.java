/*
Big Apples (Weichen Liu + Blueface, Jeffery Tang + Mathias, Lior + Toothless)
APCS
lab01(v2) -- Developing subclasses for Protagonist and Monster
2021-11-23
time spent: 0.8 hours

DISCO
- The instance variables in the super class cannot be private if you want to access them in the sub classes.

QCC
- Are there other visibility types in Java?
*/

public class Character {
  protected int health;
  protected int strength;
  protected int defense;
  protected double ar;

  public boolean isAlive() {
    return (health > 0);
  }

  public int getDefense() {
    return defense;
  }

  public void lowerHP(int damage) {
    health -= damage;
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
