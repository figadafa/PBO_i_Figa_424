package Praktikum.Users;
import java.util.InputMismatchException;
import java.util.Iterator;
import java.util.Scanner;
import Praktikum.Actions.AdminAction;
import Praktikum.Data.Item;
public class Admin extends User implements AdminAction  {
    private String Username;
    private String Password;
     
     public Admin(String nama,String Nim,String username,String password) {
        super(nama,Nim); // menggunakan super constructor
        this.Username = username;
        this.Password = password;
     }
        public String getUsername() {
            return Username;
        }
        public void setUsername(String username) {
            this.Username = username;
        }
        public String getPassword() {
            return Password;
        }

     @Override
     public boolean login() {
        Scanner scanner = new Scanner(System.in);
       System.out.print("Masukkan Username: ");
        String inputUsername = scanner.nextLine();
         System.out.print("Masukkan Password: ");
         String inputPassword = scanner.nextLine();
        if (inputUsername.equals(getUsername()) && inputPassword.equals(getPassword())) {
        System.out.println("Login Admin berhasil!");
         return true;
    }    else {
            System.out.println("Login Admin gagal!");
         return false;
    }
}

        
       
     @Override
        public void displayAppMenu(){
            Scanner scanner = new Scanner(System.in);
            int pilihan;
            do{
                System.out.println("\n=======Menu Admin=======");
                System.out.println("1. Manage User");
                System.out.println("2. Manage Item");
                System.out.println("0. Logout");
                System.out.print("Pilih menu (1/2/3): ");
                pilihan = scanner.nextInt();
                switch (pilihan) {
                    case 1:
                         ManageUser();
                        break;
                    case 2:
                        ManageItem();
                        break;
                    case 0:
                        System.out.println("Logout berhasil!");
                        break;
                                    
                    default:
                        System.out.println("Pilihan tidak valid!");
                        break;
                }
            }while ((pilihan != 0)); {
                
            }
        }           

     @Override
     public void ManageUser() {
        Scanner scanner = new Scanner(System.in);
        int pilihan = -1;
        while (pilihan !=0){
            System.out.println("\n======= Kelola Mahasiswa =======");
            System.out.println("1. Tambah Mahasiswa");
            System.out.println("2. Hapus Mahasiswa");
            System.out.println("0. Kembali");
            System.out.print("Pilih menu (1/2/0): ");
             try{
                pilihan = scanner.nextInt();
                scanner.nextLine(); // Clear newline

                switch(pilihan){
                    case 1:
                        System.out.print("Masukan Nama Mahasiswa:");
                        String nama = scanner.nextLine();
                        System.out.println("Masukan NIM Mahasiswa:");
                        String nim = scanner.nextLine();
                        Mahasiswa mahasiswaBaru = new Mahasiswa(nama, nim);
                        User.userList.add(mahasiswaBaru);
                        System.out.println("Mahasiswa berhasil ditambahkan!");
                        break;
                    case 2:
                         System.out.print("Masukan NIM Mahasiswa yang ingin dihapus: ");
                         scanner.nextLine(); // Clear newline
                         String nimHapus = scanner.nextLine();
                         boolean ditemukan = false;
                          Iterator<User> iterator = User.userList.iterator();
                        while (iterator.hasNext()) {
                            User user = iterator.next();
                            if (user instanceof Mahasiswa && user.getNim().equals(nimHapus)) {
                         iterator.remove();
                        System.out.println("Mahasiswa dengan NIM " + nimHapus + " berhasil dihapus.");
                         ditemukan = true;
                         break;
                         }
                 }
                     if (!ditemukan) {
                        System.out.println("Mahasiswa dengan NIM tersebut tidak ditemukan.");
             }
                     break;


                    case 0:
                        System.out.println("Kembali ke menu Admin...");
                        break;

                    default:
                        System.out.println("Pilihan tidak valid!");
                }

            } catch (InputMismatchException e) {
                System.out.println("Input harus berupa angka!");
                scanner.nextLine(); // clear buffer
            }
             }
              }

     

     @Override
     public void ManageItem() {
       Scanner scanner = new Scanner(System.in);
       
        if (User.reportedItems.isEmpty()) {
            System.out.println("Tidak ada barang yang dilaporkan.");
            return;
        }

        System.out.println("==== Daftar Barang Dilaporkan ====");
        for (int i = 0; i < User.reportedItems.size(); i++) {
            Item currentItem = User.reportedItems.get(i);
            if (currentItem.getItemStatus().equalsIgnoreCase("Reported")) {
                System.out.println(i + ". " + currentItem.getItemStatus() + " - " + currentItem.getdeskripsi());
            }
        }

        System.out.print("Masukkan indeks barang yang ingin ditandai sebagai 'Claimed': ");
        try {
            int index = scanner.nextInt();
            scanner.nextLine(); // clear newline
            Item itemDipilih = User.reportedItems.get(index);
            if (itemDipilih.getItemStatus().equalsIgnoreCase("Reported")) {
                itemDipilih.setItemStatus("Claimed");
                System.out.println("Status barang berhasil diubah menjadi 'Claimed'.");
            } else {
                System.out.println("Barang ini sudah ditandai sebelumnya.");
            }
        } catch (InputMismatchException e) {
            System.out.println("Input harus berupa angka!");
            scanner.nextLine(); // clear buffer
        } catch (IndexOutOfBoundsException e) {
            System.out.println("Indeks yang dimasukkan tidak valid.");
        }
    }
}
    
   
    
