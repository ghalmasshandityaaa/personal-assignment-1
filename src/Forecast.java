import java.io.IOException;
import java.util.Random;
import java.util.Scanner;

public class Forecast {
    public void start() {
        Scanner input = new Scanner(System.in);

        System.out.println("\nSelamat Datang Di Program Ramalan Cupu");
        System.out.println("++++++++++++++++++++++++++++++++++++++\n");

        System.out.println("Data Anda : ");
        System.out.println("♥♥♥♥♥");
        System.out.print("Masukkan Nama Anda : ");
        String name = input.nextLine();
        System.out.print("Masukkan Umur Anda : ");
        int age = input.nextInt();

        input.nextLine();
        System.out.println("\nData Pasangan Anda : ");
        System.out.println("♥♥♥♥♥♥♥♥♥");
        System.out.print("Masukkan Nama Pasangan Anda : ");
        String partnerName = input.nextLine();
        System.out.print("Masukkan Umur Pasangan Anda : ");
        int partnerAge = input.nextInt();
        input.nextLine();

        System.out.printf("%n%s [%d] tahun%n%n", name, age);
        love();
        System.out.printf("%n%s [%d] tahun%n", partnerName, partnerAge);

        System.out.println("\nTekan ENTER untuk melihat hasil ramalan...");
        input.nextLine();
        System.out.printf("Kecocokan anda dengan pasangan anda adalah : %.2f %s%n", calculate(), "%");

        additionalMenu(input);
    }

    private void love() {
        System.out.println("  **    **");
        System.out.println(" ****,,****");
        System.out.println("************");
        System.out.println(" **********");
        System.out.println("  ********");
        System.out.println("   ******");
        System.out.println("    ****");
        System.out.println("     **");
    }

    private double calculate() {
        Random r = new Random();
        int lowerLimit = 50;
        int upperLimit = 100;
        int random = r.nextInt(upperLimit - lowerLimit) + lowerLimit;

        return random / 1.1;
    }

    private void additionalMenu(Scanner input) {
        System.out.println("\n=================================");
        System.out.println("[1] Re-forecast [2] Back [0] Exit");
        System.out.print("Select menu : ");
        int choice = input.nextInt();

        switch (choice){
            case 1:
                start();
                break;
            case 2:
                Main main = new Main();
                main.mainMenu();
                break;
            case 0:
                exit();
                break;
        }
    }

    private void exit() {
        System.out.println("Terima Kasih karena anda telah menggunakan jasa ramalan kami.. ^^\nGoodbye!");
        System.exit(0);
    }
}
