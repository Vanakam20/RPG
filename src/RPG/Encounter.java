package RPG;

import java.util.Random;
import java.util.Scanner;

public class Encounter {
        private char[][] mapGrid; // Référence à la carte
        private int playerX;      // Position X du joueur
        private int playerY;      // Position Y du joueur
        private final char MONSTER_SYMBOL = '?'; // Symbole représentant un monstre
        private Random random;

        public Encounter(char[][] mapGrid, int playerX, int playerY) {
            this.mapGrid = mapGrid;
            this.playerX = playerX;
            this.playerY = playerY;
            this.random = new Random();
        }

        // Gère la rencontre avec un monstre
        public void handleEncounter(Caracter caracter) {
            System.out.println("You encountered a monster!");

            // Afficher la carte actuelle
            printMap();

            // Logique de combat ou de fuite
            System.out.println("Do you want to [fight] or [run]?");
            Scanner scanner = new Scanner(System.in);
            String action = scanner.nextLine();

            if (action.equalsIgnoreCase("fight")) {
                if (fightMonster(caracter)) {
                    System.out.println("You defeated the monster!");
                    mapGrid[playerY][playerX] = '.'; // Enlève le monstre de la carte
                } else {
                    System.out.println("You lost the battle!");
                    // Logique pour perdre, comme perdre des points de vie
                }
            } else if (action.equalsIgnoreCase("run")) {
                runAway();
            } else {
                System.out.println("Invalid action!");
            }
        }

        // Simule un combat avec un monstre
        private boolean fightMonster(Caracter caracter) {
            // Pour simplifier, utilisons un combat aléatoire
            // (Cela pourrait être remplacé par une logique de combat plus complexe)
            int playerStrength = caracter.getAttribute().getStrength(); // Valeur fictive pour la force du joueur
            int monsterStrength = random.nextInt(15) + 1; // Force du monstre entre 1 et 15

            System.out.println("You fight the monster with strength " + playerStrength + "!");
            System.out.println("Monster strength is " + monsterStrength + "!");

            // Retourne vrai si le joueur gagne
            return playerStrength >= monsterStrength;
        }

        // Gère la fuite du joueur
        private void runAway() {
            // Logique pour fuir, par exemple, revenir en arrière
            System.out.println("You ran away!");
            // Tu peux ajouter une logique pour déplacer le joueur à une position aléatoire ou précédente
        }

        // Affiche la carte pour montrer la position actuelle
        private void printMap() {
            for (int i = 0; i < mapGrid.length; i++) {
                for (int j = 0; j < mapGrid[i].length; j++) {
                    System.out.print(mapGrid[i][j] + " ");
                }
                System.out.println();
            }
        }
    }

