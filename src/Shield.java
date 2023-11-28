public class Shield {
    private int level;
    int Sdef;

    public Shield(int level) {
        this.level = level;
        this.Sdef = 3 + level;
    }

    public void levelUp() {
        level++;
        Sdef = 3 + level;
    }

    public void ShowDef(){
        System.out.println("Shield Atk = "+ Sdef);
    }

    public void Showlevel(){
        System.out.println("Shield level = " + level);
    }

    public double calculateRunSpeedDecrease(int characterLevel) {
        return characterLevel * (0.1 + 0.08 * level);
    }

    public double reduceDamage(double incomingDamage, int characterLevel) {
        return incomingDamage - Sdef * (1 + 0.05 * characterLevel);
    }
}
