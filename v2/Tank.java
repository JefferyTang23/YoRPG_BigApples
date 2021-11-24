/*
Big Apples (Weichen Liu + Blueface, Jeffery Tang + Mathias, Lior + Toothless)
APCS
lab01 -- Developing a RPG game
2021-11-22
time spent: 0.8 hours
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
