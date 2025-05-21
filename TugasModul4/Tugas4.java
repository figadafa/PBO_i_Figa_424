import Praktikum.Users.Admin;
import Praktikum.Users.Mahasiswa;
import Praktikum.Users.User;

import java.util.Scanner;

public class Tugas4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        boolean isRunning = true;

        // Dummy akun
        Admin admin = new Admin("Admin Sistem", "123", "admin", "admin123");
        Mahasiswa mahasiswa = new Mahasiswa("Figa Brilliant Daffa", "202410370110424");

        while (isRunning) {
            try {
                System.out.println("\n=== Sistem Login ===");
                System.out.println("1. Login sebagai Admin");
                System.out.println("2. Login sebagai Mahasiswa");
                System.out.println("0. Keluar");
                System.out.print("Pilih menu: ");
                int pilihan = Integer.parseInt(scanner.nextLine());

                switch (pilihan) {
                    case 1:
                        if (admin.login()) {
                            boolean adminLoop = true;
                            while (adminLoop) {
                                admin.displayAppMenu();
                                System.out.print("Pilih: ");
                                int pilihAdmin = Integer.parseInt(scanner.nextLine());
                                switch (pilihAdmin) {
                                    case 1:
                                        admin.ManageUser();
                                        break;
                                    case 2:
                                        admin.ManageItem();
                                        break;
                                    case 0:
                                        adminLoop = false;
                                        isRunning = false;
                                        System.out.println("Logout berhasil!");
                                        break;
                                    default:
                                        System.out.println("Pilihan tidak valid.");
                                }
                            }
                        }
                        break;

                    case 2:
                        if (mahasiswa.login()) {
                            boolean mhsLoop = true;
                            while (mhsLoop) {
                                mahasiswa.displayAppMenu();
                                System.out.print("Pilih: ");
                                int pilihMhs = Integer.parseInt(scanner.nextLine());
                                switch (pilihMhs) {
                                    case 1:
                                        mahasiswa.ReportItem();
                                        break;
                                    case 2:
                                        mahasiswa.ViewReportedItem();
                                        break;
                                    case 0:
                                        mhsLoop = false;
                                        
                                    default:
                                        System.out.println("Pilihan tidak valid.");
                                }
                            }
                        }
                        break;

                    case 0:
                        isRunning = false;
                        System.out.println("Terima kasih telah menggunakan sistem.");
                        break;

                    default:
                        System.out.println("Pilihan tidak valid.");
                }

            } catch (Exception e) {
                System.out.println("Terjadi kesalahan input. Silakan coba lagi.");
            }
        }

        scanner.close();
    }
}
