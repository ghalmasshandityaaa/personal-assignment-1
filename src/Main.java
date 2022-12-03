import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        mainMenu();
    }

    public static void mainMenu() {
        Scanner input = new Scanner(System.in);

        System.out.println("========================================");
        System.out.println("     2602212930 - Ghalmas Shanditya     ");
        System.out.println("========================================");
        System.out.printf("%-19s  %19s%n", "[1] Warehouse Stock", "Forecast [2]");
        System.out.println("[0] Exit");
        System.out.println("========================================");
        System.out.print("Select menu : ");
        int choice = input.nextInt();
        switch (choice) {
            case 1:
                Warehouse_stock warehouse = new Warehouse_stock();
                warehouse.start();
                break;
            case 2:
                Forecast forecast = new Forecast();
                forecast.start();
                break;
            case 0:
                goodbye();
                break;
        }
    }

    private static void goodbye() {
        System.out.println("Thank you for using the app\nGoodbye!");
        System.exit(0);
    }
}