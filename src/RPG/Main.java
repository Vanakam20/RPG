package RPG;
import java.util.Scanner;

public class Main {
	public static int w;

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
        Scanner scanner = new Scanner(System.in);
        System.out.println("Choose a name : ");
        String name = scanner.nextLine();
        Caracter caracter = new Caracter(name);
        System.out.println(caracter);
        
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
        
        }
    }

