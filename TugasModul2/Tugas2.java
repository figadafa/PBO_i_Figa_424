import java.util.Scanner;

class Admin{
    Scanner objinput = new Scanner(System.in);
    //
    String username;
    String password;
    String ValidPassword = "password424";
    String ValidUsername = "admin424";
    //method login
        void Login() {
            System.out.print("Masukkan username: ");
            username = objinput.next();
            System.out.print("Masukkan password: ");
            password = objinput.next();
            if(!username.equals(ValidUsername)){
                System.out.println("Login Gagal Username salah");
            }else if (!password.equals(ValidPassword)){
                System.out.println("Login Gagal Password salah");
                
            }else{
                System.out.println("========LOGIN BERHASIL========");
               
            }
        }
}
class Mahasiswa{
    Scanner objinput = new Scanner(System.in);
    String NIM;
    String Nama;
    String ValidNIM = "202410370110424";
    String ValidNama = "Figa Brilliant daffa";
        //method login
        void Login() {
            System.out.print("Masukan Nama :");
            Nama = objinput.nextLine();
            System.out.print("Masukan NIM :");
            NIM = objinput.nextLine();
        }
        //method display info
        void displayInfo() {
            if(!Nama.equals(ValidNama)){
                System.out.println("Login Gagal Username salah");
            }else if (!NIM.equals(ValidNIM)){
                System.out.println("Login Gagal Password salah");
                
            }else{
                System.out.println("========LOGIN BERHASIL========");
                System.out.println("Nama :" +Nama);
                System.out.println("NIM :"+NIM);
               
            }
        }
}

public class Tugas2 {
    public static void main(String[] args){
        int pilihan;
        Scanner objinput = new Scanner(System.in);
        //pemilihan login 
        System.out.println("Pilih login sebagai :");
        System.out.println("1. Admin");
        System.out.println("2.Mahasiswa");
        System.out.print("Masukan Pilhan :");
        pilihan = objinput.nextInt();
        //if else untuk pemilihan login
          if(pilihan ==1){
            //membuat objek admin
              Admin admin = new Admin();
              admin.Login();
            }else if(pilihan ==2){
                //membuat objek mahasiswa
                Mahasiswa mahasiswa = new Mahasiswa();
                mahasiswa.Login();
                mahasiswa.displayInfo();
            }
        objinput.close();
    }
    
}
