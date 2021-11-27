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

public class Warrior extends Protagonist {
  public static String about() {
    return "A protagonist with a good balance of offense and defense.";
  }

  public Warrior() {
    health = 600;
    strength = 100;
    defense = 40;
    ar = 0.5;
    specialPower = 5;
  }

  public Warrior(String newName) {
    this();
    setName(newName);
  }
}
