package P2.dragonGame;

import java.util.Scanner;

public class DragonMain15 {
    public static void main(String[] args) {
        Dragon15 dragon = new Dragon15();
        Scanner sc15 = new Scanner(System.in);

        dragon.width = 5;
        dragon.height = 5;

        dragon.x = dragon.width / 2;
        dragon.y = dragon.height / 2;

        String input;

        boolean gameRunning = true;
        while (gameRunning) {
            if (dragon.x == 0 || dragon.x == dragon.width || dragon.y == 0 || dragon.y == dragon.height) {
                gameRunning = false;
            }
            dragon.printPosition();

            System.out.print("Masukkan perintah (W/A/S/D): ");

            input = sc15.nextLine();

            if (input.equalsIgnoreCase  ("W")) {
                dragon.moveUp();
            } else if (input.equalsIgnoreCase("A")) {
                dragon.moveLeft();
            } else if (input.equalsIgnoreCase("S")) {
                dragon.moveDown();
            } else if (input.equalsIgnoreCase("D")) {
                dragon.moveRight();
            } else if (input.equalsIgnoreCase("Q")) {
                gameRunning = false;
            } else {
                System.out.println("Perintah tidak valid. Silakan coba lagi.");
            }
        }
    }
}
