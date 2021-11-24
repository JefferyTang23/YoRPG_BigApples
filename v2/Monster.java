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

public class Monster extends Character{

  public Monster() {
    ar = Math.random() + 0.5; 
  }

}
