package UTS_PBO;

import java.util.Scanner;
import UTS_PBO.character.Character;
import UTS_PBO.enemy.Enemy;

public class Main {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        boolean playing = true;
        
        while (playing) {
            Character player = new Character(100, 20, 5);
            Enemy enemy = new Enemy(150, 15, 5);

            System.out.println("Selamat datang di Text RPG!");

            while (true) {
                System.out.println("\nHP Character: " + player.getHP() + " | HP Enemy: " + enemy.getHP());
                System.out.println("Pilih aksi:");
                System.out.println("1. Serang");
                System.out.println("2. Bertahan");
                System.out.println("3. Minum Ramuan (sisa: " + player.getPotions() + ")");
                System.out.println("4. Keluar");
                System.out.print("> ");

                int choice = input.nextInt();
                switch (choice) {
                    case 1:
                        player.attack(enemy);
                        if (enemy.getHP() > 0)
                            enemy.attack(player);
                        break;
                    case 2:
                    player.defend(enemy.getAttack()); // tetap diserang tapi dikurangi
                        break;
                    case 3:
                        player.usePotion();
                        enemy.usePotion(1000);
                        if (enemy.getHP() > 0)
                            enemy.attack(player);
                        break;
                    case 4:
                        System.out.println("Keluar dari permainan.");
                        return;
                    default:
                        System.out.println("Pilihan tidak valid.");
                }

                if (player.getHP() <= 0) {
                    System.out.println("Game Over, mulai lagi? (y/n)");
                    String restart = input.next();
                    if (restart.equalsIgnoreCase("y")) {
                        break; // keluar dari loop dalam, mulai ulang
                    } else {
                        playing = false;
                        break;
                    }
                }

                if (enemy.getHP() <= 0) {
                    System.out.println("Selamat! Kamu mengalahkan musuh!");
                    playing = false;
                    break;
                }
            }
        }

        input.close();
        System.out.println("Terima kasih telah bermain!");
    }
}
