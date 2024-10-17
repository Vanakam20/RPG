package RPG;
import java.util.Random;

public class Map {
	private char[][] mapGrid;  // Tableau 2D pour la carte
    private int playerX;       // Position X du joueur
    private int playerY;       // Position Y du joueur
    private final char PLAYER_SYMBOL = 'P';  // Symbole représentant le joueur
    private final char EMPTY_SPACE = '.';    // Symbole représentant un espace vide
    private final char MONSTER_SYMBOL = '?';

    public Map(int width, int height) {
        mapGrid = new char[height][width];
        initializeMap();
        initializeMonster();
        placePlayer();
    }

    // Initialise la carte avec des espaces vides
    private void initializeMap() {
        for (int i = 0; i < mapGrid.length; i++) {
            for (int j = 0; j < mapGrid[i].length; j++) {
            			mapGrid[i][j] = EMPTY_SPACE;
            }
        }
    }
    
    private void initializeMonster() {
        for (int i = 0; i < mapGrid.length; i++) {
            for (int j = 0; j < mapGrid[i].length; j++) {
            	int rand_int1 = (int) (Math.random()*10);
            		if(rand_int1 == 4) {
            			mapGrid[i][j] = MONSTER_SYMBOL;
            		}
            }
        }
    }

    // Place le joueur au centre de la carte
    private void placePlayer() {
        playerX = mapGrid[0].length / 2;  // Position initiale X
        playerY = mapGrid.length / 2;     // Position initiale Y
        mapGrid[playerY][playerX] = PLAYER_SYMBOL;
    }

    // Affiche la carte
    public void printMap() {
        for (int i = 0; i < mapGrid.length; i++) {
            for (int j = 0; j < mapGrid[i].length; j++) {
                System.out.print(mapGrid[i][j] + " ");
            }
            System.out.println();
        }
    }

    // Déplace le joueur en fonction de l'entrée de l'utilisateur
    public void movePlayer(String direction) {
        // Efface l'ancienne position
        mapGrid[playerY][playerX] = EMPTY_SPACE;

        switch (direction.toLowerCase()) {
            case "up":
                if (playerY > 0) {
                    playerY--;  // Monte d'une ligne
                }
                break;
            case "down":
                if (playerY < mapGrid.length - 1) {
                    playerY++;  // Descend d'une ligne
                }
                break;
            case "left":
                if (playerX > 0) {
                    playerX--;  // Se déplace à gauche
                }
                break;
            case "right":
                if (playerX < mapGrid[0].length - 1) {
                    playerX++;  // Se déplace à droite
                }
                break;
            default:
                System.out.println("Invalid direction! Use 'up', 'down', 'left', or 'right'.");
                break;
        }

        // Met à jour la nouvelle position du joueur
        mapGrid[playerY][playerX] = PLAYER_SYMBOL;
    }
}