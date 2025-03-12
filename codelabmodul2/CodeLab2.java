import java.util.Scanner;

class rekeningBank {
    // Atribut
    String nomorRekening;
    String namaPemilik;
    double saldo;

    // Konstruktor
    rekeningBank(String nomorRekening, String namaPemilik, double saldo) {
        this.nomorRekening = nomorRekening;
        this.namaPemilik = namaPemilik;
        this.saldo = saldo;
    }

    void tampilkanInfo() {
        System.out.println("\n======INFORMASI REKENING======");
        System.out.println("Nomor Rekening: " + nomorRekening);
        System.out.println("Nama Pemilik: " + namaPemilik);
        System.out.printf("Saldo: Rp%.2f", saldo);
        System.out.println();
    }

    void tarikUang(double jumlah) {
        if (jumlah > 0 && jumlah <= saldo) {
            saldo -= jumlah;
            System.out.println(namaPemilik + " berhasil menarik uang sebesar Rp" + jumlah);
            System.out.println("Saldo Sekarang: Rp" + saldo);
        } else if (jumlah > saldo) {
            System.out.println("MAAF SALDO ANDA TIDAK MENCUKUPI");
        } else {
            System.out.println("Jumlah Tarik Harus lebih dari 0");
        }
    }


    void setorUang(rekeningBank tujuan, double jumlah) {
        if (jumlah > 0 && jumlah <= saldo) {
            this.saldo -= jumlah; // Kurangi saldo pengirim
            tujuan.saldo += jumlah; // Tambah saldo penerima
            System.out.println("Berhasil transfer Rp" + jumlah + " ke " + tujuan.namaPemilik);
        } else {
            System.out.println("Transfer gagal! Pastikan saldo cukup dan jumlah lebih dari 0.");
        }
    }
}

public class CodeLab2 {
    public static void main(String[] args) {
        Scanner objinput = new Scanner(System.in);
        // Membuat objek
        rekeningBank rekening1 = new rekeningBank("202410370110424", "Figa Brilliant Daffa", 1600000.0);
        rekeningBank rekening2 = new rekeningBank("202410370100001", "Ahmad Diallo", 1000000.0);
        // Menampilkan menu
        int pilihan;
        do {
            System.out.println("\n=======MENU=======");
            System.out.println("1. Informasi Rekening");
            System.out.println("2. Tarik Uang");
            System.out.println("3. Transfer Uang");
            System.out.println("4. Keluar");
            System.out.print("Pilihan: (1-4) ");
            pilihan = objinput.nextInt();
            switch (pilihan) {
                case 1:
                    while (true) {
                        System.out.println("\n=====Pilih Rekening=====\n");
                        System.out.println("1. Rekening Daffa");
                        System.out.println("2. Rekening Diallo");
                        System.out.println("3. Tampilkan Semua Rekening");
                        System.out.println("4. Kembali ke Menu Utama");
                        System.out.print("Pilihan: (1-4) ");
                        int pilihRekening = objinput.nextInt();
                        if (pilihRekening == 1) {
                            rekening1.tampilkanInfo();
                        } else if (pilihRekening == 2) {
                            rekening2.tampilkanInfo();
                        } else if (pilihRekening == 3) {
                            rekening1.tampilkanInfo();
                            rekening2.tampilkanInfo();
                        } else if (pilihRekening == 4) {
                            break;
                        } else {
                            System.out.println("Pilihan tidak valid");
                        }
                    }
                    break;
                case 2:
                    while (true) {
                        System.out.println("=====Pilih Rekening=====");
                        System.out.println("1. Rekening Daffa");
                        System.out.println("2. Rekening Diallo");
                        System.out.println("3. Kembali ke Menu Utama");
                        System.out.print("Pilihan: (1-3) ");
                        int pilihRekening = objinput.nextInt();
                        if (pilihRekening == 1) {
                            System.out.print("Masukkan Jumlah Uang yang akan ditarik: Rp ");
                            double jumlah = objinput.nextDouble();
                            rekening1.tarikUang(jumlah);
                        } else if (pilihRekening == 2) {
                            System.out.print("Masukkan Jumlah Uang yang akan ditarik: Rp ");
                            double jumlah = objinput.nextDouble();
                            rekening2.tarikUang(jumlah);
                        } else if (pilihRekening == 3) {
                            break;
                        } else {
                            System.out.println("Pilihan tidak valid");
                        }
                    }
                    break;
                case 3:
                while (true) {
                    System.out.println("=====Pilih Rekening Pengirim=====");
                    System.out.println("1. Rekening Daffa");
                    System.out.println("2. Rekening Diallo");
                    System.out.println("3. Kembali ke Menu Utama");
                    System.out.print("Pilihan: (1-3) ");
                    int pilihRekeningPengirim = objinput.nextInt();
                    if (pilihRekeningPengirim == 1) {
                        System.out.print("Masukkan Jumlah Uang yang akan ditransfer: Rp ");
                        double jumlah = objinput.nextDouble();
                        rekening1.setorUang(rekening2, jumlah);
                    } else if (pilihRekeningPengirim == 2) {
                        System.out.print("Masukkan Jumlah Uang yang akan ditransfer: Rp ");
                        double jumlah = objinput.nextDouble();
                        rekening2.setorUang(rekening1, jumlah);
                    } else if (pilihRekeningPengirim == 3) {
                        break;
                    } else {
                        System.out.println("Pilihan tidak valid");
                    }
                }
                break;
                case 4:
                    System.out.println("==========TERIMA KASIH==========");
                    break;
                default:
                    System.out.println("Pilihan tidak valid");
                    continue;
            }
        } while (pilihan != 4);
        objinput.close();
    }
}

