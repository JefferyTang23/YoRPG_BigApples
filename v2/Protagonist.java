/*
Big Apples (Weichen Liu + Blueface, Jeffery Tang + Mathias, Lior + Toothless)
APCS
lab01(v2) -- Developing subclasses for Protagonist and Monster
2021-11-23
time spent: 0.8 hours
*/

public class Protagonist extends Character{
  protected String name;
  protected int specialPower;

  public Protagonist() {
  }

  public Protagonist( String setName) {
    name = setName;
  }


  // methods

  public void specialize() {
    strength += specialPower;
    defense -= (specialPower / 2);
  }

  public void normalize() {
    defense += specialPower;
    strength -= (specialPower / 2);
  }

  //accessing instance variable

  public String getName () {
    return name;
  }

  //Changing instance variables

  public void setName (String newName) {
    name = newName;
  }
  
}
