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

public class Monster extends Character{

  public Monster() {
    health = 200;
    defense = 10;
    strength = (int) (Math.random() * 30 + 11);
    ar = Math.random(); 
  }

}
