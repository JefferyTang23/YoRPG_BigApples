/*
Big Apples (Weichen Liu + Blueface, Jeffery Tang + Mathias, Lior + Toothless)
APCS
lab01 -- Developing a RPG game
2021-11-22
time spent: 0.8 hours

DISCO
- The instance variables in the super class cannot be private if you want to access them in the sub classes. 

QCC
- Are there other visibility types in Java?
*/

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
