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

public class Tank extends Protagonist {
  public static String about() {
    return "A protagonist with a lot of health and defense.";
  }
  
  public Tank() {
    health = 500;
    strength = 50;
    defense = 50; 
    ar = 0.5;
    specialPower = 5; 
  }
  
  public Tank(String setName) {
    this();
    super(setName);
  }
}
