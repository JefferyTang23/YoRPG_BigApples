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

public class HobGoblin extends Monster{
  
  public static String about() {
    return "A goblin that went to school and learned some martial arts.";
  }

  public HobGoblin() {
    health = 200;
    defense = 20;
    strength = 45; 
  }

}
