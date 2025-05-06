package Praktikum.Users;

import java.util.Scanner;
import Praktikum.Actions.MahasiswaAction;


public class Mahasiswa extends User implements MahasiswaAction{
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
            System.out.println("Login Admin gagal!");
            return false;
        }
    }

    @Override
    public void ReportItem() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("=======TEMPAT PELAPORAN TEMUAN BARANG========");
        System.out.println("Nama Barang:");
        String namaBarang = scanner.nextLine();
        System.out.println("Deskripsi Barang:");
        String deskripsi = scanner.nextLine();
        System.out.println("Waktu dan Tanggal:");
        String waktu = scanner.nextLine();
        System.out.println("Lokasi Barang Ditemukan:");
        String lokasi = scanner.nextLine();
        System.out.println(">> Barang berhasil dilaporkan <<");
        scanner.close();
    }

    @Override
    public void ViewReportedItem() {
        System.out.println("Fitur ini belum tersedia.");
    }
    
  
    
    
    
}
