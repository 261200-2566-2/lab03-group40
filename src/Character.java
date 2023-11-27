import java.text.DecimalFormat;
public class Character {
    private final String name;
    private double atk;
    private int def;
    private int level;
    private int maxHP;
    private int currentHP;
    private int maxMana;
    private int currentMana;
    private final double baseRunSpeed;
    private double maxRunSpeed;
    private Sword equippedSword;
    private Shield equippedShield;

    public Character(String name, int level, int baseRunSpeed) {
        this.name = name;
        this.level = level;
        this.baseRunSpeed = baseRunSpeed;
        updateStat();
    }
    public void levelUp() {
        level++;
        updateStat();
    }

    public void equipSword(Sword sword) {
        equippedSword = sword;
        atk += sword.calculateDamage(level);
        updateRunSpeed();
    }

    public void equipShield(Shield shield) {
        equippedShield = shield;
        def += shield.Sdef;
        updateRunSpeed();
    }

    public void takeDamage(double damage) {
        if (equippedShield != null) {
            damage = (int) equippedShield.reduceDamage(damage, level);
        }
        currentHP -= (int)damage;
        if (currentHP < 0) {
            currentHP = 0;
            System.out.println();
            System.out.println("-----------------------------------");
            System.out.println(name + "you died"); // Reference from Dark Souls
            System.out.println("-----------------------------------");
            System.out.println();
        } else {
            System.out.println(name + " took " + damage + " damage!");
            System.out.println();
        }
    }

    public void fireball(int manaCost) {
        if (currentMana >= manaCost) {
            currentMana -= manaCost;
            System.out.println(name + " uses Fireball!!");
            System.out.println();
        } else {
            System.out.println("mana mai por halfuu");
            System.out.println();
        }

    }

    public void ShowName(){
        System.out.println("-----------------------------------");
        System.out.println("Character Name: " + name);
        System.out.println("-----------------------------------");
        System.out.println();
    }

    public void ShowStatus(){
        atk = Double.parseDouble(new DecimalFormat("##.##").format(atk));
        System.out.println("-----------------------------------");
        System.out.println("atk = " + atk + " def = " + def);
        System.out.println("-----------------------------------");
        System.out.println();
    }

    public void ShowHMR(){
        System.out.println("HP Gauge = " + maxHP);
        System.out.println("Mana Gauge = " + maxMana);
        System.out.println("RunSpeed = " + maxRunSpeed);
        System.out.println();
    }

    public void ShowCurrentHP(){
        System.out.println("hp = " + currentHP + "/" + maxHP);
        System.out.println();
    }

    public void ShowCurrentMana(){
        System.out.println("Mana = " + currentMana + "/" + maxMana);
        System.out.println();
    }

    public static void attack(Character attacker, Character target) {
        double damage = attacker.atk;
        target.takeDamage(damage);
    }

    private void updateRunSpeed() {
        double swordSD = (equippedSword != null) ? equippedSword.calculateRunSpeedDecrease(level) : 0;
        double shieldSD = (equippedShield != null) ? equippedShield.calculateRunSpeedDecrease(level) : 0;
        double totalSD = swordSD + shieldSD;
        maxRunSpeed = calculateMaxSpeed() - totalSD;
    }

    private void updateStat() {
        maxHP = 100 + 10 * level;
        atk = level;
        def = 0;
        currentHP = maxHP;
        maxMana = 50 + 2 * level;
        currentMana = maxMana;
        maxRunSpeed = calculateMaxSpeed();
    }

    private double calculateMaxSpeed() {
        return baseRunSpeed * (0.1 + 0.03 * level);
    }
}
