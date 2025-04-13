public class Admin extends User {
    private  String username = "admin";
    private  String password = "admin123";

    public Admin(String nama, String nim) {
        super(nama, nim); // menggunakan super constructor
    }

    @Override
    public boolean login(String inputUsername, String inputPassword) {
        return inputUsername.equals(username) && inputPassword.equals(password);
    }

    @Override
    public void displayInfo() {
        System.out.println("Login Admin berhasil!");
        super.displayInfo();
    }
}
