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

public class Assassin extends Protagonist {
  public static String about() {
    return "A protagonist with a lot of strength and attack rating, but with low survivability.";
  }

  public Assassin() {
    health = 400;
    strength = 120;
    defense = 20;
    ar = 2;
    specialPower = 5;
  }

  public Assassin(String newName) {
    this();
    setName(newName);
  }
}
