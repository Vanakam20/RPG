package RPG;

public abstract class Attribute {
    // Attributs généraux pour chaque personnage
    private int strength;
    private int agility;
    private int intelligence;
    private int stamina;
    private int defense;
    private int magicResist;
    private int criticalChance;
    private int luck;

    // Constructeur
    public Attribute(int strength, int agility, int intelligence, int stamina, int defense, int magicResist, int criticalChance, int luck) {
        this.strength = strength;
        this.agility = agility;
        this.intelligence = intelligence;
        this.stamina = stamina;
        this.defense = defense;
        this.magicResist = magicResist;
        this.criticalChance = criticalChance;
        this.luck = luck;
    }

    // Getters et Setters
    public int getStrength() { return strength; }
    public void setStrength(int strength) { this.strength = strength; }

    public int getAgility() { return agility; }
    public void setAgility(int agility) { this.agility = agility; }

    public int getIntelligence() { return intelligence; }
    public void setIntelligence(int intelligence) { this.intelligence = intelligence; }

    public int getStamina() { return stamina; }
    public void setStamina(int stamina) { this.stamina = stamina; }

    public int getDefense() { return defense; }
    public void setDefense(int defense) { this.defense = defense; }

    public int getMagicResist() { return magicResist; }
    public void setMagicResist(int magicResist) { this.magicResist = magicResist; }

    public int getCriticalChance() { return criticalChance; }
    public void setCriticalChance(int criticalChance) { this.criticalChance = criticalChance; }

    public int getLuck() { return luck; }
    public void setLuck(int luck) { this.luck = luck; }

    @Override
    public String toString() {
        return "Strength: " + strength + ", Agility: " + agility + ", Intelligence: " + intelligence +
               ", Stamina: " + stamina + ", Defense: " + defense + ", Magic Resist: " + magicResist +
               ", Critical Chance: " + criticalChance + ", Luck: " + luck;
    }
}