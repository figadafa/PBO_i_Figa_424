package Praktikum.Users;

import java.util.ArrayList;

import Praktikum.Data.Item;

public abstract class User {
    private String nama;
    private String nim;


     public static ArrayList<User> userList = new ArrayList<>();
     public static ArrayList<Item> reportedItems = new ArrayList<>();
    
    public User(String nama, String nim) {
        this.nama = nama;
        this.nim = nim;
    }

    public String getNama() {
        return nama;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public String getNim() {
        return nim;
    }

    public void setNim(String nim) {
        this.nim = nim;
    }

    public abstract boolean login();

    public   void displayAppMenu() {
        
    }
}
    

   



