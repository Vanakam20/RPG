package RPG;

public class Caracter {
	private String Nom;
	private double money;
	private double XP;
	private double mana;
	private Weapon weapon;
	private Attribute attribute;

	public Caracter(String nom) {
		this.Nom = nom;
		this.money = 200;
		this.XP = 0;
		this.mana = 100;
	}

	    // Getter et Setter pour Nom
	    public String getNom() {
	        return Nom;
	    }

	    public void setNom(String nom) {
	        this.Nom = nom;
	    }

	    // Getter et Setter pour money
	    public double getMoney() {
	        return money;
	    }

	    public void setMoney(double money) {
	        this.money = money;
	    }

	    // Getter et Setter pour XP
	    public double getXP() {
	        return XP;
	    }

	    public void setXP(double XP) {
	        this.XP = XP;
	    }

	    // Getter et Setter pour mana
	    public double getMana() {
	        return mana;
	    }

	    public void setMana(double mana) {
	        this.mana = mana;
	    }

	    // Getter et Setter pour weapon
	    public Weapon getWeapon() {
	        return weapon;
	    }

	    public void setWeapon(Weapon weapon) {
	        this.weapon = weapon;
	    }
	    
	    public Attribute getAttribute() {
	        return attribute;
	    }
	    
	    public void setAttribute(Attribute attribute) {
	        this.attribute = attribute;
	    }
	    
	    public String toString() {
	        return this.Nom + " - XP = " + this.XP + " - Mana = " + this.mana;
	    }
	}
	
	

