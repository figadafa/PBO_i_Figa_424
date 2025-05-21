package Praktikum.Users;
import Praktikum.Data.Item;

import java.util.Scanner;
import Praktikum.Actions.MahasiswaAction;

public class Mahasiswa extends User implements MahasiswaAction {
    public Mahasiswa(String nama, String nim) {
        super(nama, nim); // menggunakan super constructor


    }

    @Override
    public boolean login() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Masukkan Username Nama : ");
        String InputNama = scanner.nextLine();
        System.out.print("Masukkan Password NIM : ");
        String InputNIM = scanner.nextLine();
        
        if (InputNama.equals(getNama()) && InputNIM.equals(getNim())) {
            System.out.println("Login Mahasiswa berhasil!");
            System.out.println("Nama : " + getNama());
            System.out.println("NIM  : " + getNim());
            return true;
        } else {
            System.out.println("Login Mahasiswa gagal!");
            return false;
        }
    }

    @Override
    public void ReportItem() {
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("======= TEMPAT PELAPORAN TEMUAN BARANG =======");
        System.out.print("Nama Barang: ");
        String nama = scanner.nextLine();
        System.out.print("Deskripsi Barang: ");
        String deskripsi = scanner.nextLine();
        System.out.print("Lokasi Barang Ditemukan: ");
        String lokasi = scanner.nextLine();

        // Membuat objek Item baru dan menambahkannya ke daftar barang yang dilaporkan
        Item item = new Item(nama,deskripsi,lokasi);
        User.reportedItems.add(item); 
        System.out.println("Pelaporan barang berhasil ditambahkan.");
    }
            
    @Override
    public void ViewReportedItem() {
        if (User.reportedItems.isEmpty()) {
            System.out.println("Tidak ada barang yang dilaporkan.");
        } else {
            System.out.println("Daftar Barang yang Dilaporkan:");
            for (Item item : User.reportedItems) {
                if (item.getItemStatus().equals("Reported")) {
                System.out.println(item);
                
            }  
        }

    }     
}
    @Override
    public void displayAppMenu() {
        System.out.println("=== Menu Mahasiswa ===");
        System.out.println("1. Lapor Barang Hilang");
        System.out.println("2. Lihat Daftar Barang yang Dilaporkan");
        System.out.println("0. Keluar");
    }
}