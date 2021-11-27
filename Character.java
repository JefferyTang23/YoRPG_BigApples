/*
Big Apples (Weichen Liu + Blueface, Jeffery Tang + Mathias, Lior + Toothless)
APCS
lab01 -- Developing a RPG Game
2021-11-25
time spent: 0.8 hours

DISCO
- The instance variables in the super class cannot be private if you want to access them in the sub classes.
- The Object type can match variable type, or be any subclass of declared variable type. 
- If a method accepts a superclass, you can also parameter pass its subclasses. 

QCC
- Are there other visibility types in Java?
- How do you use both this() and super() in the same method? 

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
