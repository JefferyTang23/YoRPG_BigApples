/*
Big Apples (Weichen Liu + Blueface, Jeffery Tang + Mathias, Lior + Toothless)
APCS
lab01 -- Developing a RPG game
2021-11-22
time spent: 0.8 hours
*/

public class Warrior extends Protagonist {
  public static String about() {
    return "A protagonist with a lot of strength and defense.";
  }
  
  public Warrior() {
    health = 300;
    strength = 70;
    defense = 40; 
    ar = 0.5;
    specialPower = 5; 
  }
  
    public Warrior(String setName) {
    this();
    super(setName);
  }
}
