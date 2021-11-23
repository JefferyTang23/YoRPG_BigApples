/*
Big Apples (Weichen Liu + Blueface, Jeffery Tang + Mathias, Lior + Toothless)
APCS
LAB01 -- YoRPG
2021-11-22
time spent: .5 hours
*/
public class Protagonist extends Character{
  private String name;
  private int specialPower;

  public Protagonist() {
    name = "Pat"; 
    health = 200;
    defense = 10;
    strength = 40;
    specialPower = (int) Math.random() * 15;
    ar = Math.random();
  }

  public Protagonist( String setName) {
    this();
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

  public int getHP () {
    return health;
  }


  public int getStrength () {
    return strength;
  }



  //Changing instance variables

  public void setName (String newName) {
    name = newName;
  }

  public void setHP (int newHP) {
    health = newHP;
  }

  public void setDefense (int newDefense) {
    defense = newDefense;
  }

  public void setStrength (int newStrength) {
    strength = newStrength;
  }


}
