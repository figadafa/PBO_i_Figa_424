package Praktikum.Data;
public class Item {
    private String nama;
    private String deskripsi;
    private String lokasi;
    private String itemStatus;
    // Constructor lengkap
    public Item(String nama, String deskripsi, String lokasi, String itemStatus) {
    this.nama = nama;
    this.deskripsi = deskripsi;
    this.lokasi = lokasi;
    this.itemStatus = itemStatus;
}
     public Item(String nama, String deskripsi, String lokasi) {
        this.nama = nama;
        this.deskripsi = deskripsi;
        this.lokasi = lokasi;
        this.itemStatus = "Reported";
    }
    // Getter
    public String getNama() {
        return nama;
    }

    // Setter untuk nama
    public void setNama(String nama) {
        this.nama = nama;
    }

    public String getdeskripsi() { // Perbaikan di sini
        return deskripsi;
    }
    public String getLokasi() {
        return lokasi;
    }

    public String getItemStatus() {
        return itemStatus;
    }

    // Setter (optional, kalau kamu butuh ubah data)
    public void setItemStatus(String itemStatus) {
        this.itemStatus = itemStatus;
    }
    public String toString() {
        return ("Nama: " + nama + "\n" +
               "Deskripsi: " + deskripsi + "\n" +
               "Lokasi: " + lokasi + "\n" +
               "Status: " + itemStatus);
    }
}
