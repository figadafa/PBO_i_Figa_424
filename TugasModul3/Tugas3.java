import java.util.Scanner;
//superclass
class User{
    private String Nama;
    private String NIM;
    //constructor
    public User(String Nama, String NIM){
        this.Nama = Nama;
        this.NIM = NIM;
    }
    //setter
    public void setNama(String Nama){
        this.Nama = Nama;
    }
    public void setNIM(String NIM){
        this.NIM = NIM;
    }
    //getter
    public String getNama(){
        return Nama;
    }
    public String getNIM(){
        return NIM;
    }
    //Method yang akan di override
    public boolean login(){
       return this.Nama.equals("Figa Brilliant Daffa") && this.NIM.equals("202410370110424");
    }
    public void displayInfo(){
        System.out.println("Nama : "+getNama());
        System.out.println("NIM : "+getNIM());
    }
}
//subclass admin
class Admin extends User{
    private String username;
    private String password;
    private String inputUsername;
    private String inputPassword;
    //constructor
    public Admin(String Nama, String NIM, String username, String password){
        super(Nama, NIM);
        this.username = username;
        this.password = password;
    }
    public void setinput(String username, String password){
        this.inputPassword = password;
        this.inputUsername = username;

    }
    @Override
    public boolean login(){
        //validasi username dan password
        return this.username.equals("admin") && this.password.equals("admin123");
    }
    @Override
    public void displayInfo(){
        System.out.println("========LOGIN BERHASIL========");
        super.displayInfo();
    }
}
//subclass mahasiswa
class Mahasiswa extends User{
    public Mahasiswa(String Nama, String NIM, String username, String password){
        super(Nama, NIM);
    }
    @Override
    public boolean login(){
        return this.getNama().equals("Figa Brilliant Daffa") && this.getNIM().equals("202410370110424");
    }
    @Override
    public void displayInfo(){
        System.out.println("========LOGIN BERHASIL========");
        super.displayInfo();
    }
}


public class Tugas3 {
    public static void main(String[] args) {
        int pilihan;
        Scanner objinput = new Scanner(System.in);
        //membuat objek admin
        Admin admin = new Admin("Figa Brilliant Daffa", "202410370110424", "admin", "admin123");
        //membuat objek mahasiswa
        Mahasiswa mahasiswa = new Mahasiswa("Figa Brilliant Daffa", "202410370110424", "mahasiswa", "mahasiswa123");
        //pemilihan login
        System.out.println("Pilih login sebagai :");
        System.out.println("1. Admin");
        System.out.println("2. Mahasiswa");
        System.out.print("Masukan Pilhan :");
        pilihan = objinput.nextInt();
        objinput.nextLine(); // Consume newline left-over
         //if else untuk pemilihan login
         if (pilihan == 1) {
            //login admin
            System.out.print("Masukan Username :");
            String username = objinput.nextLine();
            System.out.print("Masukan Password :");
            admin.setinput("admin", "admin123");
            String password = objinput.nextLine();
            if (admin.login()) {
                admin.displayInfo();
            } else {
                System.out.println("Login Gagal");
            }
        } else if (pilihan == 2) {
            //login mahasiswa
            System.out.print("Masukan Nama :");
            String Nama = objinput.nextLine();
            System.out.print("Masukan NIM :");
            String NIM = objinput.nextLine();
            if (mahasiswa.login()) {
                mahasiswa.displayInfo();
            } else {
                System.out.println("Login Gagal");
            }
        } else {
            System.out.println("Pilihan tidak valid");
        }
    }
    
}
