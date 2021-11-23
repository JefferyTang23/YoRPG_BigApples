/*
Big Apples (Weichen Liu + Blueface, Jeffery Tang + Mathias, Lior + Toothless)
APCS
LAB01 -- YoRPG
2021-11-22
time spent: .5 hours

DISCO
-

QCC
-


*/

public class Monster extends Character{

  public Monster() {
    health = 200;
    defense = 10;
    strength = (int) (Math.random() * 30 + 11);
    ar = Math.random(); 
  }

}
