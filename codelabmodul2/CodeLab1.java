class Hewan {
    String Nama;
    String Jenis;
    String Suara;

    void tampilkanInfo() {
        System.out.println("Nama Hewan: " + Nama);
        System.out.println("Jenis Hewan: " + Jenis);
        System.out.println("Suara Hewan: " + Suara);
        System.out.println();
    }
}

public class CodeLab1 {
    public static void main(String[] args) {
        Hewan Hewan1 = new Hewan();
        Hewan1.Nama = "Kucing";
        Hewan1.Jenis = "Mamalia";
        Hewan1.Suara = "Meong";
        Hewan1.tampilkanInfo();

        Hewan Hewan2 = new Hewan();
        Hewan2.Nama = "Anjing";
        Hewan2.Jenis = "Mamalia";
        Hewan2.Suara = "Guk Guk";
        Hewan2.tampilkanInfo();
    }
}
