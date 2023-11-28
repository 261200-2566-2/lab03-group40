public class Sword {
    private int level;
    int Satk;

    public Sword(int level) {
        this.level = level;
        this.Satk = 5 + level;
    }

    public void ShowAtk(){
        System.out.println("Sword Atk = "+ Satk);
    }

    public void Showlevel(){
        System.out.println("Sword level = " + level);
    }
    public void levelUp() {
        level++;
        Satk = 5 + level;
    }

    public double calculateRunSpeedDecrease(int characterLevel) {
        return characterLevel * (0.1 + 0.04 * level);
    }

    public double calculateDamage(int characterLevel) {
        return Satk * (1 + 0.1 * characterLevel);
    }
}
