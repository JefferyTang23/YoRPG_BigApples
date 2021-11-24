/*
Big Apples (Weichen Liu + Blueface, Jeffery Tang + Mathias, Lior + Toothless)
APCS
lab01 -- Developing a RPG game
2021-11-22
time spent: 0.8 hours
*/

public class Assassin extends Protagonist {
  public static String about() {
    return "A protagonist with a lot of strength and attack rating."
  }
  
  public Assassin() {
    health = 200;
    strength = 70;
    defense = 20; 
    ar = 2;
    specialPower = 5; 
  }
}
