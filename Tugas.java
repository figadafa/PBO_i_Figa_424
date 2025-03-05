import java.util.Scanner;
public class Tugas {
    public static void main(String[] args) {
        int pilihan;
        Scanner objinput = new Scanner(System.in);
        //pemilihan login 
        System.err.println("Pilih login sebagai :");
        System.err.println("1. Admin");
        System.out.println("2.Mahasiswa");
        System.out.print("Masukan Pilhan :");
        pilihan = objinput.nextInt();
        //if else untuk pemilihan login

            if(pilihan ==1){
                String username;
                String password;
                String ValidPassword = "password424";
                String ValidUsername = "admin424";
                 System.out.print("Masukkan username: ");
                  username = objinput.next();
            
                 System.out.print("Masukkan password: ");
                  password = objinput.next();
            
                   if(!username.equals(ValidUsername) && !password.equals(ValidPassword)){
                          System.out.println("Login Gagal Username atau Password Salah");
                   }else{
                            System.out.println("Login Berhasil");
                   }
            }else if(pilihan ==2){
                String NIM;
                String Nama;
                String ValidNIM = "202410370110424";
                String ValidNama = "Figa Brilliant daffa";
                System.out.println("Masukan NIM :");
                NIM = objinput.nextLine();
                System.out.println("Masukan Nama :");
                Nama = objinput.nextLine();

                if(!Nama.equals(ValidNama) && !NIM.equals(ValidNIM )){
                    System.out.println("Login Gagal Username atau Password Salah");
                 }else{
                      System.out.println("Login Berhasil");
                }

             }else{
                    System.out.println("Pilihan Tidak Ada");
             }
        objinput.close();
    }
    
}
