package RPG;
import java.util.Scanner;

public class Main {
	public static int w;
	public static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) throws CloneNotSupportedException {
        /*Axe axe = new Axe();
        System.out.println(axe.asciiArt());

        Hammer hammer = new Hammer();
        System.out.println(hammer.asciiArt());

        Bow bow = new Bow();
        System.out.println(bow.asciiArt());*/

        WeaponStore store = new WeaponStore();
        /*for (Weapon w : store.getWeapons()) {
            System.out.println(w.asciiArt());
        }*/
        //store.printWeapons();

        
        
        System.out.println("Choose a name : ");
        String name = scanner.nextLine();
        Caracter caracter = new Caracter(name);
        System.out.println(caracter);
        Map map = new Map(10, 10,caracter);
        System.out.println("Choose a class: [0] Warrior, [1] Mage, [2] Archer, [3] Druid");
        String classChoice = scanner.nextLine();
        Attribute characterAttributes = null;

        // Attribution des attributs par défaut selon la classe choisie
        switch (classChoice) {
            case "0":
                characterAttributes = new Warrior();
                System.out.println("You chose: Warrior");
                break;
            case "1":
                characterAttributes = new Mage();
                System.out.println("You chose: Mage");
                break;
            case "2":
                characterAttributes = new Archer();
                System.out.println("You chose: Archer");
                break;
            case "3":
                characterAttributes = new Druid();
                System.out.println("You chose: Druid");
                break;
            default:
                System.out.println("Invalid choice.");
                break;
        }

        if (characterAttributes != null) {
            System.out.println("Your character's attributes: " + characterAttributes);
        }
        
        
        caracter.setAttribute(characterAttributes);
        store.printWeapons();
        String answershop = "N";
        while (answershop.equals("N")) {
        System.out.println("Choose a weapon : [0] Axe, [1]Hammer, [2]Bow");
        String numweapon = scanner.nextLine();
        w=Integer.parseInt(numweapon); 
        System.out.println(store.getoneWeapons(w));
        System.out.println("Money : " + caracter.getMoney() + " | Are you sure you want to buy this weapon ?: [Y]Yes or [N]No");
        answershop = scanner.nextLine();
        	}
        
		caracter.setWeapon(store.getoneWeapons(w));
        System.out.println("Weapon purchase!");
        
        String input;
        do {
            map.printMap();
            System.out.println("Move your player (up, down, left, right) or type 'exit' to quit:");
            input = scanner.nextLine();
            if (!input.equalsIgnoreCase("exit")) {
                map.movePlayer(input);
            }
        } while (!input.equalsIgnoreCase("exit"));

        System.out.println("Game over!");
        scanner.close();
        }
    }

