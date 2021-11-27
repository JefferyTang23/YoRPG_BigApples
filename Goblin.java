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

public class Goblin extends Monster{
  
  public static String about() {
    return "A weak goblin.";
  }

  public Goblin() {
    health = 100;
    defense = 20;
    strength = 35; 
  }

}
