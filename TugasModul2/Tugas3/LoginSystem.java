import java.util.Scanner;

public class LoginSystem {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Data awal
        Admin admin = new Admin("Figa Brilliant Daffa", "202410370110424");
        Mahasiswa mahasiswa = new Mahasiswa("Figa Brilliant Daffa", "202410370110424");

        System.out.println("=== Sistem Login ===");
        System.out.println("1. Login sebagai Admin");
        System.out.println("2. Login sebagai Mahasiswa");
        System.out.print("Pilih menu (1/2): ");
        int pilihan = scanner.nextInt();
        scanner.nextLine(); // membersihkan newline

        switch (pilihan) {
            case 1:
                System.out.print("Masukkan Username Admin : ");
                String username = scanner.nextLine();
                System.out.print("Masukkan Password Admin : ");
                String password = scanner.nextLine();

                if (admin.login(username, password)) {
                    admin.displayInfo();
                } else {
                    System.out.println("Login Admin gagal!");
                }
                break;

            case 2:
                System.out.print("Masukkan Nama Mahasiswa : ");
                String nama = scanner.nextLine();
                System.out.print("Masukkan NIM Mahasiswa   : ");
                String nim = scanner.nextLine();

                if (mahasiswa.login(nama, nim)) {
                    mahasiswa.displayInfo();
                } else {
                    System.out.println("Login Mahasiswa gagal!");
                }
                break;

            default:
                System.out.println("Pilihan tidak valid!");
        }

        scanner.close();
    }
}
