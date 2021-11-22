/*
Big Apples (Weichen Liu + Blueface, Jeffery Tang + Mathias, Lior + Toothless)
APCS
LAB01 -- YoRPG
2021-11-22
time spent: .5 hours
*/
public class Monster {
  private int health;
  private int defense;
  private int atk;
  private double ar;

  public Monster() {
    health = 200;
    defense = 10;
    atk = (int) (Math.random() * 30 + 11);
  }

  public void lowerHP(int dmg) {
    health -= dmg;
  }

  public int attack(Protagonist protagonist) {
    int damage = (int)(getATK() - protagonist.getDefense());
    if (damage > 0) {
      protagonist.lowerHP(damage);
    } else {
      damage = 0;
    }
    return damage;
  }

  public boolean isAlive(){
    return health > 0;
  }

  // accessing instance variables

  public int getHp () {
    return health;
  }

  public int getDefense() {
    return defense;
  }

  public int getATK() {
    return atk;
  }




  // changing instance variables

  public void setHP(int newHP) {
    health = newHP;
  }

  public void setDefense(int newDefense) {
    defense = newDefense;
  }

  public void setATK(int newATK) {
    atk = newATK;
  }
}
