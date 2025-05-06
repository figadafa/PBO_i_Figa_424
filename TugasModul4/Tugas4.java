
import Praktikum.Users.Admin;
import Praktikum.Users.Mahasiswa;
import Praktikum.Users.User;
import java.util.Scanner;



public class Tugas4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        User user = null;

       
        System.out.println("=== Sistem Login ===");
        System.out.println("1. Login sebagai Admin");
        System.out.println("2. Login sebagai Mahasiswa");
        System.out.print("Pilih menu (1/2): ");
        int pilihan = scanner.nextInt();
        scanner.nextLine(); // membersihkan newline

        switch (pilihan) {
            case 1:
               Admin admin = new Admin("Admin Sistem", "123", "admin", "admin123");
                if (admin.login()) {
                    user = admin;
                } else {
                    System.out.println("Login Admin gagal!");
                }
                break;

            case 2:
                Mahasiswa mahasiswa = new Mahasiswa("Figa Brilliant Daffa", "202410370110424");
                if (mahasiswa.login()) {
                    user = mahasiswa;
                    
                } else {
                    System.out.println("Login Mahasiswa gagal!");
                }
                break;

            default:
                System.out.println("Pilihan tidak valid!");
        }
        if(user != null) {
            user.displayAppMenu();
            if (user instanceof Mahasiswa) {
                Mahasiswa mahasiswa = (Mahasiswa) user;
                mahasiswa.ReportItem();
            } else if (user instanceof Admin) {
                Admin admin = (Admin) user;
                admin.displayAppMenu();
            }
        } 

         // Tutup scanner

        scanner.close();
    }
}
