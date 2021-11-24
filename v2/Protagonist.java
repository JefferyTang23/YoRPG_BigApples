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

public class Protagonist extends Character{
  private String name;
  private int specialPower;

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
