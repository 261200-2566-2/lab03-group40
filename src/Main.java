
public class Main {
    public static void main(String[] args) {
        Character b2 = new Character("B2", 1, 5);
        Character a2 = new Character("A2", 1, 10);

//        System.out.println(b2.name);
//        System.out.println("atk = " + b2.atk + " def = " + b2.def)
        b2.ShowName();
        b2.ShowStatus();

        Sword sword = new Sword(1);
        Shield shield = new Shield(1);
        sword.ShowAtk();
        shield.ShowDef();
        System.out.println();
        a2.equipSword(sword);
        b2.equipSword(sword);
        b2.equipShield(shield);

        b2.ShowStatus();
//        System.out.println("atk = " + b2.atk + " def = " + b2.def);

        b2.ShowHMR();
        b2.levelUp();
        System.out.println("-----------------------------------");
        System.out.println("level up!!!");
        System.out.println("-----------------------------------");
        System.out.println();
        b2.ShowHMR();
        System.out.println("-----------------------------------");
        System.out.println();

        b2.takeDamage(30);
        b2.ShowCurrentHP();
        b2.fireball(30);
        b2.ShowCurrentMana();
        b2.fireball(30);
        Character.attack(a2, b2);
        b2.ShowCurrentHP();

        sword.levelUp();
        sword.Showlevel();
        shield.levelUp();
        shield.Showlevel();
    }




}
