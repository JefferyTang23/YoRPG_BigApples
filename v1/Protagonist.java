/*
Big Apples (Weichen Liu + Blueface, Jeffery Tang + Mathias, Lior + Toothless)
APCS
LAB01 -- YoRPG
2021-11-22
time spent: .5 hours
*/
public class Protagonist {
  private String name;
  private int health;
  private int defense;
  private int atk;
  private int specialpower;
  private double ar;

  public Protagonist() {
    name = "Pat";
    health = 200;
    defense = 10;
    atk = 40;
    specialpower = (int) Math.random() * 15;
  }

  public Protagonist( String setName) {
    this();
    name = setName;
  }


  // methods

  public boolean isAlive(){
    return health > 0;
  }

  public void lowerHP(int dmg) {
    health -= dmg;
  }

  public void specialize() {
    atk += specialpower;
  }

  public void normalize() {
    defense += specialpower;
  }

  public int attack(Monster monster) {
    int damage = (int)(getATK() - monster.getDefense());
    if (damage > 0) {
      monster.lowerHP(damage);
    } else {
      damage = 0;
    }
    return damage;
  }

  //accessing instance variable

  public String getName () {
    return name;
  }

  public int getHP () {
    return health;
  }

  public int getDefense () {
    return defense;
  }

  public int getATK () {
    return atk;
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

  public void setStrength (int newATK) {
    atk = newATK;
  }


}
