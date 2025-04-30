import Perpustakaan.*;

public class CodeLab {
    public static void main(String[] args) {
      Buku buku1= new Fiksi("J.K. Rowling", "Harry Potter", 1997, "Fantasi");
      Buku buku2= new NonFiksi("Stephen Hawking", "A Brief History of Time", 1988, "Ilmu Pengetahuan");
      
      //Menampilkan informasi buku
        System.out.println("Informasi Buku 1:");
        buku1.displayInfo();
        System.out.println("\nInformasi Buku 2:");
        buku2.displayInfo();
        System.out.println("\n=========================");

        //Membuat objek anggota
        Anggota anggota1 = new Anggota("Daffa", "424");
        Anggota anggota2 = new Anggota("Diki", "426");

        //Menampilkan informasi anggota
        System.out.println("Informasi Anggota 1:");
        anggota1.displayInfo();
        System.out.println("\nInformasi Anggota 2:");
        anggota2.displayInfo();
        System.out.println("");
        //Menampilkan informasi anggota pinjam buku
        anggota1.pinjamBuku(buku1);
        anggota2.pinjamBuku(buku2, 20);

        //menampilkan informasi anggota pengembalian buku
        anggota2.kembalikanBuku(buku2);
        anggota1.kembalikanBuku(buku1);

    }
}
