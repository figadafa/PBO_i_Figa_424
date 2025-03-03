//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
import java.util.Scanner;
import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {
        String nama;
        char jenisKelamin;
        int tahunLahir;
        int umur;

        Scanner objinput = new Scanner(System.in);

        // Meminta input nama
        System.out.print("Masukan Nama Anda : ");
        nama = objinput.nextLine();
        // Meminta input jenis kelamin
        System.out.print("Masukkan Jenis Kelamin (P/L): ");
        jenisKelamin = objinput.next().charAt(0);

        // Meminta input tahun lahir
        System.out.print("Masukkan Tahun Lahir Anda: ");
        tahunLahir = objinput.nextInt();

        // Menutup Scanner
        objinput.close();

        // Menghitung umur berdasarkan tahun lahir
        int tahunSekarang = LocalDate.now().getYear();
        umur = tahunSekarang - tahunLahir;

        // Menentukan jenis kelamin
        String jenisKelaminStr;
        if (jenisKelamin == 'L' || jenisKelamin == 'l') {
            jenisKelaminStr = "Laki-laki";
        } else if (jenisKelamin == 'P' || jenisKelamin == 'p') {
            jenisKelaminStr = "Perempuan";
        } else {
            jenisKelaminStr = "Tidak diketahui";
        }

        // Menampilkan hasil
        System.out.println("\nData Diri Anda:");
        System.out.println("Nama: " + nama);
        System.out.println("Jenis Kelamin: " + jenisKelaminStr);
        System.out.println("Umur: " + umur + " tahun");
    }
}