public class Sword {
    int level;
    public int Satk;

    public Sword(int level) {
        this.level = level;
        this.Satk = 5 + level;
    }

    public double calculateRunSpeedDecrease(int characterLevel) {
        return characterLevel * (0.1 + 0.04 * level);
    }

    public double calculateDamage(int characterLevel) {
        return Satk * (1 + 0.1 * characterLevel);
    }
}
