import java.util.Scanner;

public class Warehouse_stock {
    public void start() {
        Scanner input = new Scanner(System.in);
        System.out.print("Masukkan nama anda : ");
        String name = input.nextLine();

        System.out.println("Stok Gudang Input Barang");
        System.out.println("########################\n");

        System.out.println("Selamat Datang " + name);
        System.out.printf("%-45s : ", "Masukkan nama barang yang mau ditambah");
        String productName = input.nextLine();
        System.out.printf("%-45s : ", "Masukkan jumlah barang yang mau ditambah");
        int stockProduct = input.nextInt();
        System.out.printf("%-45s : ", "Masukkan harga beli untuk barang tersebut");
        Double buyPrice = input.nextDouble();
        System.out.printf("%-45s : ", "Masukkan harga jual untuk barang tersebut");
        Double sellPrice = input.nextDouble();
        System.out.println("\nStok Gudang Rincian Barang");
        System.out.println("##########################");

        System.out.printf("%-15s : %s%n", "Nama Barang", productName);
        System.out.printf("%-15s : %d%n", "Jumlah Barang", stockProduct);
        System.out.printf("%-15s : Rp. %.2f%n", "Harga Beli", buyPrice);
        System.out.printf("%-15s : Rp. %.2f%n", "Harga Jual", sellPrice);

        menuChoice(input);
    }

    private void menuChoice(Scanner input) {
        System.out.println("\n======================================");
        System.out.println("[1] Add more product [2] Back [0] Exit");
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
        System.out.println("Thank you for using the app\nGoodbye!");
        System.exit(0);
    }
}
