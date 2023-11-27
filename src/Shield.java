public class Shield {
    private final int level;
    public int Sdef;

    public Shield(int level) {
        this.level = level;
        this.Sdef = 3 + level;
    }

    public double calculateRunSpeedDecrease(int characterLevel) {
        return characterLevel * (0.1 + 0.08 * level);
    }

    public double reduceDamage(double incomingDamage, int characterLevel) {
        return incomingDamage - Sdef * (1 + 0.05 * characterLevel);
    }
}
