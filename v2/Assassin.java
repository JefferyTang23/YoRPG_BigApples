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

public class Assassin extends Protagonist {
  public static String about() {
    return "A protagonist with a lot of strength and attack rating.";
  }
  
  public Assassin() {
    health = 200;
    strength = 70;
    defense = 20; 
    ar = 2;
    specialPower = 5; 
  }
  
  public Assassin(String newName) {
    this();
    setName(newName);
  }
}
