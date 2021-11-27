/*
Big Apples (Weichen Liu + Blueface, Jeffery Tang + Mathias, Lior + Toothless)
APCS
lab01 -- Developing a RPG Game
2021-11-25
time spent: 0.8 hours

DISCO
- The instance variables in the super class cannot be private if you want to access them in the sub classes.
- The Object type can match variable type, or be any subclass of declared variable type. 
- If a method accepts a superclass, you can also parameter pass its subclasses. 

QCC
- Are there other visibility types in Java?
- How do you use both this() and super() in the same method? 

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
